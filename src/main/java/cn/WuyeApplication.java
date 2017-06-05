package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ServletComponentScan
public class WuyeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WuyeApplication.class, args);
		System.out.println("123");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WuyeApplication.class);
	}
}
