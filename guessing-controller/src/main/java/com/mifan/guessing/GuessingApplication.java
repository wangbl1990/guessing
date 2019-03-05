package com.mifan.guessing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mifan.guessing" })
@MapperScan("com.mifan.guessing.dao.mapper")
//@ImportResource({"classpath:dubbo-consumer.xml","classpath:dubbo-provider.xml"})
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class GuessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuessingApplication.class, args);
	}

	@Bean
	@Order(1)
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter( this.jwtAuthenticationFilter());
		registrationBean.addUrlPatterns("/app/*","/boss/*");
		return registrationBean;
	}

	@Bean
	public UserAuthenticationFilter jwtAuthenticationFilter() {
		return new UserAuthenticationFilter();
	}

}
