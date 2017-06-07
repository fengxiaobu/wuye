package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = "cn")
@PropertySource(value={"classpath:application.properties"})
public class WuyeApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(WuyeApplication.class, args);
		String[] beanNames =  run.getBeanDefinitionNames();


		SpringApplication.run(WuyeApplication.class, args);
	} 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WuyeApplication.class);
	}
}
