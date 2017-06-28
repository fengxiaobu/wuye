package cn.rzhd.wuye.common;

import cn.rzhd.wuye.pay.unionpay.SDKConfig;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * luopa 在 2017/5/27 创建.
 * 注册MyBatis分页插件PageHelper
 */
@Configuration
public class UnionPayConfig  implements ApplicationListener<ApplicationStartedEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SDKConfig.getConfig().loadPropertiesFromSrc();// 从classpath加载acp_sdk.properties文件
    }
}
