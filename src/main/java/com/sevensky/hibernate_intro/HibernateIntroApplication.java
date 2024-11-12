package com.sevensky.hibernate_intro;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateIntroApplication.class, args);
	}


}
