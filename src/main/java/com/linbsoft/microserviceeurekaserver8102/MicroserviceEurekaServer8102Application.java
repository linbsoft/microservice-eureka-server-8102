package com.linbsoft.microserviceeurekaserver8102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaServer8102Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaServer8102Application.class, args);
	}

}

