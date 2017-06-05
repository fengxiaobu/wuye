package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.CorpVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/6/5.
 */
public class CompanyServiceTest extends BaseTest {

    @Autowired
    ICompanyService service;

    @Test
    public void addCompanyTest(){
        RequesterVO req = new RequesterVO();
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);
        String baseData = WebService.getBaseData(req);
        ResponseVO resp = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
        if ("Y".equals(resp.getIssuccess()) && StringUtil.isEmpty(resp.getErrorinfo())){
            for (CorpVO vo : resp.getCorpdata()) {
                service.addCompany(vo);
            }

        }


    }
}
