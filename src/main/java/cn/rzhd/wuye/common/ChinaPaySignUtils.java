package cn.rzhd.wuye.common;

import com.chinapay.secss.SecssUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * luopa 在 2017/6/9 创建.
 */
public class ChinaPaySignUtils {
    /**
     * 签名
     * @param myMap
     * @return
     */
    public static Map<String,Object> sign( Map<String, Object> myMap){
        Map<String,Object> result=new HashMap<String,Object>();
        SecssUtil secssUtil = new SecssUtil();
        //从默认配置文件初始化安全控件
        secssUtil.init();
        System.out.println("未知错误测试-->" + secssUtil.getErrMsg());
        secssUtil.sign(myMap);
        if (!"00".equals(secssUtil.getErrCode())) {
            String msg="签名过程发生错误，错误信息为-->" + secssUtil.getErrMsg();
            System.out.println(msg);
            result.put("state","-1");
            result.put("msg",msg);
            return result;
        }
        String sign = secssUtil.getSign();
        System.out.println("sign-->" + sign);
        result.put("state","1");
        result.put("sign",sign);
        return result;
    }
}
