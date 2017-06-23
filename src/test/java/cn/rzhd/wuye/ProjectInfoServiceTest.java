package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IProjectInfoService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.ProjectVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
public class ProjectInfoServiceTest extends BaseTest {
    @Autowired
    IProjectInfoService service;
    @Autowired
    ICompanyService companyService;

    @Test
    public void addProjectInfoTest() {
        List<Company> list = companyService.getAll();
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_PROJECT);
        for (Company vo : list) {
            String pk_corp = vo.getPkCorp();
            req.setPk_corp(pk_corp);
            String projectStr = WebService.getBaseData(req);
            ResponseVO projectResult = JsonUtils.jsonToPojo(projectStr, ResponseVO.class);
            if ("Y".equals(projectResult.getIssuccess()) && StringUtil.isEmpty(projectResult.getErrorinfo())) {
                ProjectVO[] projectdata = projectResult.getProjectdata();
                for (ProjectVO projectVO : projectdata) {
                    service.addProjectInfo(projectVO);
                }
            }
        }
    }
}

