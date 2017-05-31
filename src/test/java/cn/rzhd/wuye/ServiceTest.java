package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.MD5Utils;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.ProjectVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;

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
}