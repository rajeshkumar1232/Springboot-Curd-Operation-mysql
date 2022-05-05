package com.net.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class V5UsermgtAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(V5UsermgtAppApplication.class, args);
	}

}
