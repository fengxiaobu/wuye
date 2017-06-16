package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import org.apache.axis2.AxisFault;
import org.junit.Test;

/**
 * luopa 在 2017/6/16 创建.
 */
public class UpLoadTest {

    @Test
    public void uoload() throws AxisFault {


        ResponseVO responseVO = new ResponseVO();
        RequesterVO requesterVO=new RequesterVO();
        requesterVO.setKey("liando");
        requesterVO.setPk_corp("1008");
        requesterVO.setBilltype("PACT");
        String baseData = WebService.getBaseData(requesterVO);
        System.out.println("baseData = " + baseData);

    }
}
