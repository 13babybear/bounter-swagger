package com.bounter.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置
 */
@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket platformApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("full-platform").apiInfo(apiInfo())
				.forCodeGeneration(true);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Bounter-API").description("©2017 Copyright. Powered By Bounter.")
				// .termsOfServiceUrl("")
				.contact(new Contact("Bounter", "", "1317492210@qq.com")).build();
	}

}