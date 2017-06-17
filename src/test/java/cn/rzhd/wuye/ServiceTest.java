package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.uploadclient.Exception;
import cn.rzhd.wuye.utils.FirstAndLastDay;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.MD5Utils;
import cn.rzhd.wuye.vo.*;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * luopa 在 2017/5/25 创建.
 */
public class ServiceTest extends BaseTest {

    @Test
    public void getBaseDataTest() {
        RequesterVO req = new RequesterVO();
        req.setKey("liando");
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);
        String baseData = WebService.getBaseData(req);
        ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);

        if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())) {
            ProjectVO[] projectdata = responseVO.getProjectdata();
            for (ProjectVO vo: projectdata) {
                System.out.println(vo);
            }

        }
//        req.setBilltype(LiandoServiceConstant.DATA_TYPE_SELL_CUSTOMER);
//        String baseData2 = WebService.getBaseData(req);
//        ResponseVO responseVO2 = JsonUtils.jsonToPojo(baseData2, ResponseVO.class);
//
//        if ("Y".equals(responseVO2.getIssuccess()) && StringUtil.isEmpty(responseVO2.getErrorinfo())) {
//            CustomerVO[] customerdata2 = responseVO2.getCustomerdata();
//            for (CustomerVO vo: customerdata2) {
//                System.out.println(vo);
//            }
//
//        }



    }


    @Test
    public void md5Password(){
        String s = MD5Utils.md5("123456");
        System.out.println(s);
    }

    @Test
    public void accountTest(){
        RequesterVO vo = new RequesterVO();
        vo.setKey("liando");
        vo.setPk_corp("1031");
        vo.setBilltype(LiandoServiceConstant.DATA_TYPE_HOUSE);
        String baseData = WebService.getBaseData(vo);
        ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
        if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
            FeeitemVO[] vos = responseVO.getFeeitemdata();
            if (vos!=null){
                vo.setBilltype(LiandoServiceConstant.DATA_TYPE_BANK_ACCOUNT);
                for (FeeitemVO feeitemVO : vos) {
                    String pk_fee = feeitemVO.getPk_fee();
                    vo.setPk_feetype(pk_fee);
                    String data = WebService.getBaseData(vo);
                    ResponseVO pojo = JsonUtils.jsonToPojo(data, ResponseVO.class);
                    if ("Y".equals(pojo.getIssuccess()) && StringUtil.isEmpty(pojo.getErrorinfo())){
                        FeeAccountVO feeaccountdata = pojo.getFeeaccountdata();
                        System.out.println(feeaccountdata.getAccount());
                    }
                }

            }
        }
    }

    @Test
    public void testTest(){
        Date first = FirstAndLastDay.getLast("2017-02");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(first);
        System.out.println(s);
    }

    @Autowired
    IPropertyFeeService propertyFeeService;
    @Autowired
    IKfFeeService kfFeeService;
    @Autowired
    ICompanyService companyService;

    @Test
    public void insertRzFee(){
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        List<Company> companies = companyService.getAll();
        //物业入驻费用拉取保存
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_WY_RZ_FEE);
        for (Company company : companies) {
            String pkCorp = company.getPkCorp();
            req.setPk_corp(pkCorp);
            String baseData = WebService.getBaseData(req);
            ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
                FeeVO[] feedata = responseVO.getFeedata();
                for (FeeVO vo : feedata) {
                    propertyFeeService.addRzFee(vo);
                }
            }
        }
        //开发入驻费用拉取保存
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_KF_RZ_FEE);
        for (Company company : companies) {
            String pkCorp = company.getPkCorp();
            req.setPk_corp(pkCorp);
            String baseData = WebService.getBaseData(req);
            ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
                FeeVO[] feedata = responseVO.getFeedata();
                for (FeeVO vo : feedata) {
                    kfFeeService.addRzFee(vo);
                }
            }
        }
    }

    @Test
    public void testUpload() throws RemoteException, Exception {

    }
}
