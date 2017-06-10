package cn.rzhd.wuye.common;


import com.chinapay.secss.SecssUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * luopa 在 2017/6/9 创建.
 *
 * 初始化控件初始化安全控件
 */
@Configuration
public class ChianPayConfig {
    @Bean
    public boolean init() {

        SecssUtil secssUtil = new SecssUtil();
        //从默认配置文件初始化安全控件
        secssUtil.init();
        System.out.println("未知错误测试-->" + secssUtil.getErrMsg());

        if (!"00".equals(secssUtil.getErrCode())) {
            System.out.println("签名过程发生错误，错误信息为-->" + secssUtil.getErrMsg());
            return true;
        }

        return false;
    }
}
