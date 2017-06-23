package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IManageService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.ManageVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/23.
 */
public class ManageServiceTest extends BaseTest {
    @Autowired
    IManageService service;
    @Autowired
    ICompanyService companyService;

    @Test
    public void addManageTest(){
        List<Company> list = companyService.getAll();
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_GLC);
        for (Company company : list) {
            String pkCorp = company.getPkCorp();
            req.setPk_corp(pkCorp);
            String baseData = WebService.getBaseData(req);
            ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
                ManageVO[] managedata = responseVO.getManagedata();
                for (ManageVO managedatum : managedata) {
                    service.addManage(managedatum);
                }
            }
        }
    }
}
