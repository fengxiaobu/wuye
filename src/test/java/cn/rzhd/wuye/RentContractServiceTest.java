package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by hasee on 2017/5/26.
 */
public class RentContractServiceTest extends BaseTest {
	@Autowired
	IRentContractService service;

	@Test
	public void getRentContractTest() {
		List<PactVO> rentContract = service.getRentContract(LiandoServiceConstant.DATA_TYPE_PACT, "1031");
		for (PactVO pactVO : rentContract) {
			System.out.println(pactVO);
		}

	}
	
	@Test
	public void test1() throws Exception {
		String pk_pact = "11111111";
		String pk_customerid = "123456";
		List<PactVO> pactVOs = service.getRentContractByCustomer(pk_pact, pk_customerid);
		for (PactVO pactVO : pactVOs) {
			System.out.println(pactVO);
		}
	}

	@Test
	public void getRentContractTest1() {
		String pk_pact = "1031XX100000000YVGOE";
		List<PactVO> backAll = service.getBackAll();
		for (PactVO pactVO : backAll) {
			String vname = pactVO.getProjectVO().getVname();
			System.out.println(vname);
		}
	}

	@Test
	public void getCompanyId() {
		RequesterVO vo = new RequesterVO();
		vo.setBilltype("CORP");
		String baseData = WebService.getBaseData(vo);
		System.out.println(baseData);
	}

	@Test
	public void addTest() {
		RequesterVO vo = new RequesterVO();
		vo.setKey("liando");
		vo.setBilltype("CORP");
		String baseData = WebService.getBaseData(vo);
		ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
		if (responseVO != null) {
			if ("Y".equals(responseVO.getIssuccess())) {
				for (CorpVO corpVO : responseVO.getCorpdata()) {
					String pk_corp = corpVO.getPk_corp();
					if (!pk_corp.isEmpty()) {
						List<PactVO> pactVOList = service.getRentContract(LiandoServiceConstant.DATA_TYPE_PACT,
								pk_corp);
						if (pactVOList != null) {
							for (PactVO pactVO : pactVOList) {
								service.addRentContract(pactVO);
							}
						}

					}
				}
			}
		}
	}
}
