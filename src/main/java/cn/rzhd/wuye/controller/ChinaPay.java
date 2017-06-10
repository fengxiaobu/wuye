package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.common.ChinaPaySignUtils;
import cn.rzhd.wuye.common.RequestVO;
import cn.rzhd.wuye.utils.BeanUtils;
import com.chinapay.secss.SecssUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String toChinaPay(Model model,RequestVO requestVO, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //前台页面传过来的
        //Map<String, Object> requestData = new HashMap<String, Object>();
        requestVO.setMerPageUrl("http://127.0.0.1:52211/index");
        Map<String, Object> objectMap = BeanUtils.objectToMap(requestVO);
        ChinaPaySignUtils chinaPaySignUtils = new ChinaPaySignUtils();
        SecssUtil secssUtil=new SecssUtil();
        secssUtil.sign(objectMap);

        Map<String, Object> sign = chinaPaySignUtils.sign(objectMap);
        resp.setCharacterEncoding("UTF-8");
        StringBuffer sb = new StringBuffer();
        model.addAttribute("Signature",sign.get("sign"));
        model.addAttribute("Version",requestVO.getVersion());
        model.addAttribute("MerId",requestVO.getMerId());
        model.addAttribute("MerOrderNo",requestVO.getMerOrderNo());
        model.addAttribute("TranDate",requestVO.getTranDate());
        model.addAttribute("TranTime",requestVO.getTranTime());
        model.addAttribute("OrderAmt",requestVO.getOrderAmt());
        model.addAttribute("BusiType",requestVO.getBusiType());
        model.addAttribute("MerBgUrl",requestVO.getMerBgUrl());
        model.addAttribute("RemoteAddr",requestVO.getRemoteAddr());
        model.addAttribute("TranType",requestVO.getTranType());
        model.addAttribute("MerPageUrl",requestVO.getMerPageUrl());
        return "toChinaPay";
    }
}
