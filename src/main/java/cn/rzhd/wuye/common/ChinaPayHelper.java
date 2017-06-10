package cn.rzhd.wuye.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * luopa 在 2017/6/9 创建.
 *
 * chinaPay支付帮助类
 */
@PropertySource("classpath:config/ChinaPayHelper.properties")
public class ChinaPayHelper {
    @Value("${MerchantCode}")
    public static String merchantCode;
    /**
     * 获取商户编号
     * @return
     */
    public static String getMerchantCode(){

        return merchantCode;
    }
}
