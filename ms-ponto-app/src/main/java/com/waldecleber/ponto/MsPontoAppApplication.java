package com.waldecleber.ponto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = { "com.waldecleber.ponto", "com.waldecleber.ponto.controller" })
@EntityScan(basePackages = "com.waldecleber.ponto.model")
@EnableJpaRepositories(basePackages={"com.waldecleber.ponto.repository"})
public class MsPontoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPontoAppApplication.class, args);
	}

}
