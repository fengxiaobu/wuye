package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.common.ChinaPaySignUtils;
import cn.rzhd.wuye.common.RequestVO;
import cn.rzhd.wuye.utils.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * luopa 在 2017/6/1 创建.
 */
@Controller
public class ChinaPay {

    @RequestMapping("/topay")
    public String toPay() {
        return "/pay";
    }

    @RequestMapping("/pay")
    public void toChinaPay(RequestVO requestVO, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //前台页面传过来的
        //Map<String, Object> requestData = new HashMap<String, Object>();
        Map<String, Object> objectMap = BeanUtils.objectToMap(requestVO);
        ChinaPaySignUtils chinaPaySignUtils = new ChinaPaySignUtils();


        Map<String, Object> sign = chinaPaySignUtils.sign(objectMap);
        resp.setCharacterEncoding("UTF-8");
        StringBuffer sb = new StringBuffer();
        sb.append("http://newpayment-test.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0").append("?")
               .append("Version=").append(requestVO.getVersion()).append("$")
                .append("MerId=").append(requestVO.getMerId()).append("$")
                .append("MerOrderNo=").append(requestVO.getMerOrderNo()).append("$")
                .append("TranDate=").append(requestVO.getTranDate()).append("$")
                .append("TranTime=").append(requestVO.getTranTime()).append("$")
                .append("OrderAmt=").append(requestVO.getOrderAmt()).append("$")
                .append("BusiType=").append(requestVO.getBusiType()).append("$")
                .append("MerBgUrl=").append(requestVO.getMerBgUrl()).append("$")
                .append("RemoteAddr=").append(requestVO.getRemoteAddr()).append("$")
                .append("Signature=").append(sign.get("sign"));
        System.out.println(sign.get("sign"));
        resp.sendRedirect(sb.toString());
    }
}
