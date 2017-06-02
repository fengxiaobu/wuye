package cn.rzhd.wuye.chinapay;


import com.chinapay.secss.SecssUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * luopa 在 2017/6/1 创建.
 */
@WebServlet(name = "autoLoadServlet", urlPatterns = "/", loadOnStartup = 0)
public class AutoLoadServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        SecssUtil secssUtil = new SecssUtil();
        //从默认配置文件初始化安全控件
        secssUtil.init();
        Map<String, Object> myMap = new HashMap<String, Object>();
        //参与签名的字段和值
        myMap.put("MerId", "100001705221342");
        myMap.put("MerOrderNo", "123456789012345");
        String signature = "adcdefg……";
        //签名串字符串
       myMap.put("Signature", signature);
        secssUtil.sign(myMap);
        if (!"00".equals(secssUtil.getErrCode())) {
            System.out.println("签名过程发生错误，错误信息为-->" + secssUtil.getErrMsg());
            return;
        }
        String sign = secssUtil.getSign();
        System.out.println("sign-->" + sign);
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        System.out.println("初始化自动加载:        " + secssUtil.getErrMsg());



    }

}
