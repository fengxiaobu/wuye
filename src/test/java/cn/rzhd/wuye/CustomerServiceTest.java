package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.CustomerCentreMapper;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.ICustomerCentreService;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.CustomerVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
public class CustomerServiceTest extends BaseTest {
    @Autowired
    ICustomerService service;
    @Autowired
    ICustomerCentreService customerCentreService;
    @Autowired
    CustomerCentreMapper mapper;
    @Autowired
    ICompanyService companyService;


    @Test
    public void loginTest() {
        Customer cus = new Customer();
        String username = "test";
        cus.setVccode(username);
        String tempPassword = "123456";
        cus.setPassword(tempPassword);
        List<Customer> customers = service.loginByPwd(cus);
        System.out.println(customers);
        //List<HouseInfo> houseInfo = customer.getHouseInfos();
//        for (HouseInfo info : houseInfo) {
//            System.out.println(info.getHouseInfoId());
//            System.out.println(info.getHouseProperty());
//        }


    }

    @Test
    public void test3() throws Exception {
        String phone = "11000000000000";
        List<String> allPhone = service.allPhone();
        if (allPhone.contains(phone)) {
            System.out.println("有这个手机号,绑补刀");
        } else {
            System.out.println("没得，可以绑");
        }
    }

    @Test
    public void addCustomerTest() {
        List<Company> companyList = companyService.getAll();
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        for (Company vo : companyList) {
            String pk_corp = vo.getPkCorp();
            req.setBilltype(LiandoServiceConstant.DATA_TYPE_SELL_CUSTOMER);
            req.setPk_corp(pk_corp);
            String sellCustomerStr = WebService.getBaseData(req);
            ResponseVO sellCusResult = JsonUtils.jsonToPojo(sellCustomerStr, ResponseVO.class);
            if ("Y".equals(sellCusResult.getIssuccess()) && StringUtil.isEmpty(sellCusResult.getErrorinfo())) {
                CustomerVO[] customerdata = sellCusResult.getCustomerdata();
                for (CustomerVO customerdatum : customerdata) {
                    service.addCustomer(customerdatum);
                }
            }
        }
        for (Company vo : companyList) {
            String pk_corp = vo.getPkCorp();
            req.setBilltype(LiandoServiceConstant.DATA_TYPE_RENT_CUSTOMER);
            req.setPk_corp(pk_corp);
            String rentCustomerStr = WebService.getBaseData(req);
            ResponseVO rentCusResult = JsonUtils.jsonToPojo(rentCustomerStr, ResponseVO.class);
            if ("Y".equals(rentCusResult.getIssuccess()) && StringUtil.isEmpty(rentCusResult.getErrorinfo())) {
                CustomerVO[] customerdata = rentCusResult.getCustomerdata();
                for (CustomerVO customerdatum : customerdata) {
                    service.addCustomer(customerdatum);
                }
            }
        }
    }


    @Test
    public void test() throws Exception {
        String customerId = "123456";
        PerfectInformation perfectInformation = mapper.findInfoById(customerId);
        System.out.println(perfectInformation);
    }

    @Test
    public void testName() throws Exception {
        List<PerfectInformation> all = mapper.getAll();
        for (PerfectInformation perfectInformation : all) {
            System.out.println(perfectInformation);
        }
    }
}
