package com.isgi.caloriescounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.isgi.caloriescounter",
		exclude = SecurityAutoConfiguration.class)
@EntityScan({"com.isgi.caloriescounter.datamodel.entity"})
@EnableJpaRepositories(basePackages = "com.isgi.caloriescounter.datamodel.repository")
@EnableConfigurationProperties
public class CaloriesCounterBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaloriesCounterBackApplication.class, args);
	}

}
