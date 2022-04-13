package com.covid.covidDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CovidDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(CovidDemoApplication.class);

	public static void main(String[] args) {
		logger.info("CovidDemoApplication starts");
		SpringApplication.run(CovidDemoApplication.class, args);
		System.out.println("welcome");

	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.covid.covidDemo")).paths(PathSelectors.any()).build();
	}

}
