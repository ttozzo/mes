package com.msaexample.msaproject.rest;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class LotSwaggerConfig implements WebMvcConfigurer {
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
	                .paths(PathSelectors.any())
	                .build()
	                .useDefaultResponseMessages(false)
	                .globalResponseMessage(RequestMethod.GET,
	                        Arrays.asList(
	                                new ResponseMessageBuilder()
	                                        .code(500)
	                                        .message("500 message")
	                                        .responseModel(new ModelRef("string"))
	                                        .build(),
	                                new ResponseMessageBuilder()
	                                        .code(403)
	                                        .message("Forbidden")
	                                        .build(),
	                                new ResponseMessageBuilder()
	                                        .code(400)
	                                        .message("Bad Request")
	                                        .build()))
	                .globalResponseMessage(RequestMethod.POST,
	                        Arrays.asList(
	                                new ResponseMessageBuilder()
	                                        .code(500)
	                                        .message("500 message")
	                                        .responseModel(new ModelRef("string"))
	                                        .build(),
	                                new ResponseMessageBuilder()
	                                        .code(403)
	                                        .message("Forbidden")
	                                        .build(),
	                                new ResponseMessageBuilder()
	                                        .code(400)
	                                        .message("Bad Request")
	                                        .build()));
	    }

	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html")
	                .addResourceLocations("classpath:/META-INF/resources/");

	        registry.addResourceHandler("/webjars/**")
	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
	    }

}
