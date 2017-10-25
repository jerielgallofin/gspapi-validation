package com.starter88.gspapivalidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages={"com.starter88.gspapivalidate"})
@EntityScan (basePackages = { "com.starter88.gspapivalidate.persistence.entity" })
public class GspapiValidateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GspapiValidateApplication.class, args);
	}
}
