package cn.rzhd.wuye.conf;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * shiro的配置类
 * @author Administrator
 *
 */
@Configuration
public class ShiroConfiguration {
    @Bean
    public ShiroFilterFactoryBean shiroFilter() {
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        bean.setSecurityManager(securityManager());
        //配置登录的url和登录成功的url
        bean.setLoginUrl("/login");
        bean.setSuccessUrl("/index");
        //配置访问权限
        LinkedHashMap<String, String> filterChainDefinitionMap=new LinkedHashMap<>();
/*      filterChainDefinitionMap.put("/jsp/login.jsp*", "anon"); //表示可以匿名访问
        filterChainDefinitionMap.put("/loginUser", "anon"); 
        filterChainDefinitionMap.put("/logout*","anon");
        filterChainDefinitionMap.put("/jsp/error.jsp*","anon");
        filterChainDefinitionMap.put("/jsp/index.jsp*","authc");
        filterChainDefinitionMap.put("/*", "authc");//表示需要认证才可以访问
        filterChainDefinitionMap.put("/**", "authc");//表示需要认证才可以访问
        */
       /* filterChainDefinitionMap.put("/*.*", "authc");*/
        bean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return bean;
    }
    //配置核心安全事务管理器  
    @Bean
	public DefaultWebSecurityManager securityManager() {
    	System.err.println("--------------shiro已经加载----------------");
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		// 设置realm.
		securityManager.setRealm(authRealm());
		return securityManager;
	}
    //配置自定义的权限登录器
    @Bean
    public AuthRealm authRealm() {
        AuthRealm authRealm=new AuthRealm();
        return authRealm;
    }	
    //配置自定义的密码比较器
/*    @Bean
    public CredentialsMatcher credentialsMatcher() {
        return new CredentialsMatcher();
    }*/
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator creator=new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager());
        return advisor;
    }
}