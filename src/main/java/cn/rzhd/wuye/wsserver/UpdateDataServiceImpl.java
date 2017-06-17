package cn.rzhd.wuye.wsserver;

import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.service.IProjectInfoService;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.vo.CorpVO;
import cn.rzhd.wuye.vo.CustomerVO;
import cn.rzhd.wuye.vo.HouseVO;
import cn.rzhd.wuye.vo.ProjectVO;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hasee on 2017/6/6.
 */

@Component(value = "UpdateDataService")
public class UpdateDataServiceImpl implements IUpdateDataService {
    @Autowired
    private ICompanyService companyService;
    @Autowired
    private IProjectInfoService projectInfoService;
    @Autowired
    private IHouseInfoDetailsService houseInfoDetailsService;
    @Autowired
    private ICustomerService customerService;

    @Override
    public JsonResult updateData(RequesterVO req) {
        if (StringUtil.isNotEmpty(req.getKey()) && "wuye".equals(req.getKey())) {
            String type = req.getBilltype();
            try {
                switch (type) {
                    case "CORP":
                        for (Object o : req.getData()) {
                            CorpVO corpVO = (CorpVO) o;
                            companyService.saveRecords(corpVO);
                        }
                        break;
                    case "PROJECT":
                        for (Object o : req.getData()) {
                            ProjectVO projectVO = (ProjectVO) o;
                            projectInfoService.saveProjectInfo(projectVO);
                        }
                        break;
                    case "HOUSE":
                        for (Object o : req.getData()) {
                            HouseVO houseVO = (HouseVO) o;
                            houseInfoDetailsService.saveHouseInfoDetails(houseVO);
                        }
                        break;
                    case "CUSTOMER":
                        for (Object o : req.getData()) {
                            CustomerVO customerVO = (CustomerVO) o;
                            customerService.saveCustomer(customerVO);
                        }
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new JsonResult(e.getMessage());
            }
            return new JsonResult();
        } else {
            return new JsonResult("非法访问!");
        }
    }
}
