package com.overkill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories("com.overkill.dao")
@EntityScan("com.overkill.entity")
public class AppEntryPoint {
	public static void main(String[] args) {
		SpringApplication.run(AppEntryPoint.class, args);
	}
}
