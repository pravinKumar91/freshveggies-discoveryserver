package com.prsolutions.freshveggiesdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FreshveggiesDiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshveggiesDiscoveryserverApplication.class, args);
	}

}
