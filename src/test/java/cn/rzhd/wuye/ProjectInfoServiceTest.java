package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IProjectInfoService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.*;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/6/5.
 */
public class ProjectInfoServiceTest extends BaseTest {
    @Autowired
    IProjectInfoService service;

    @Test
    public void addProjectInfoTest(){
        RequesterVO req = new RequesterVO();
        req.setKey("liando");
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);
        String corps = WebService.getBaseData(req);
        ResponseVO resp = JsonUtils.jsonToPojo(corps, ResponseVO.class);
        if ("Y".equals(resp.getIssuccess()) && StringUtil.isEmpty(resp.getErrorinfo())){
            CorpVO[] corpVOS = resp.getCorpdata();
            req.setBilltype(LiandoServiceConstant.DATA_TYPE_PROJECT);
            for (CorpVO vo : corpVOS) {
                String pk_corp = vo.getPk_corp();
                req.setPk_corp(pk_corp);
                String projectStr = WebService.getBaseData(req);
                ResponseVO projectResult = JsonUtils.jsonToPojo(projectStr, ResponseVO.class);
                if ("Y".equals(projectResult.getIssuccess()) && StringUtil.isEmpty(projectResult.getErrorinfo())){
                    ProjectVO[] projectdata = projectResult.getProjectdata();
                    for (ProjectVO projectVO : projectdata) {
                        service.addProjectInfo(projectVO);
                    }

                }
            }

        }
    }
}
