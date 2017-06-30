package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.PactVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RentContractServiceTest extends BaseTest {
	@Autowired
	IRentContractService service;
	@Autowired
	ICompanyService companyService;
	@Test
	public void test1() throws Exception {
		String vccode = "ZLZH20100703108";
		List<PactVO> pactVOs = service.getRentContractByCustomer(vccode);
		for (PactVO pactVO : pactVOs) {
			System.out.println(pactVO);
		}
	}

	@Test
	public void getContractTest(){
		List<Company> list = companyService.getAll();
		RequesterVO req = new RequesterVO();
		req.setKey(LiandoServiceConstant.SERVICE_KEY);
		req.setBilltype(LiandoServiceConstant.DATA_TYPE_PACT);
		for (Company company : list) {
			String pkCorp = company.getPkCorp();
			req.setPk_corp(pkCorp);
			String baseData = WebService.getBaseData(req);
			ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
			if("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
				PactVO[] pactdata = responseVO.getPactdata();
				for (PactVO vo : pactdata) {
					service.addRentContract(vo);
				}
			}
		}

	}
}
