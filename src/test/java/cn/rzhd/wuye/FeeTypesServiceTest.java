package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IFeeTypesService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.FeeitemVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
public class FeeTypesServiceTest extends BaseTest {

    @Autowired
    IFeeTypesService service;

    @Autowired
    ICompanyService companyService;

    @Test
    public void addFeeTypesTest() {
        List<Company> companies = companyService.getAll();
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_FEE_TYPE);
        for (Company company : companies) {
            String pkCorp = company.getPkCorp();
            req.setPk_corp(pkCorp);
            String baseData = WebService.getBaseData(req);
            ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())) {
                FeeitemVO[] feeitemVOS = responseVO.getFeeitemdata();
                for (FeeitemVO vo : feeitemVOS) {
                    service.addFeeTypes(vo);
                }
            }
        }
    }


}
