package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/6.
 */
public class PropertyFeeServiceTest extends BaseTest {

    @Autowired
    IPropertyFeeService service;
    @Autowired
    ICompanyService companyService;

    @Test
    public void addPropertyFeeTest(){
        List<Company> list = companyService.getAll();
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_KF_FEE);
        for (Company company : list) {
            String pkCorp = company.getPkCorp();
            req.setPk_corp(pkCorp);
            String baseData = WebService.getBaseData(req);
            ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
                FeeVO[] vos = responseVO.getFeedata();
                for (FeeVO vo : vos) {
                    service.addPropertyFee(vo);
                }

            }
        }
    }
    @Test
    public void queryTest(){
//        ArrearsQuery query = new ArrearsQuery();
//        query.setHouseInfoId("1028XX1000000001N2UC");
//        Map<String, Object> stringObjectMap = service.queryForPay(query);
//        if (stringObjectMap!=null){
//            List current = stringObjectMap.get("current");
//            List past = stringObjectMap.get("past");
//            if (current!=null && past!=null){
//                for (Object o : current) {
//                    System.out.println(o);
//                }
//                for (Object o : past) {
//                    System.out.println(o);
//                }
//
//            }
//        }
    }
}
