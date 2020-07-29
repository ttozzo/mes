package com.msaexample.msaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class MsaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaProjectApplication.class, args);
	}

}
