package com.MicroAdministracion.Config_Servere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer; 



@SpringBootApplication
@EnableConfigServer
public class ConfigServereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServereApplication.class, args);
	}

}
