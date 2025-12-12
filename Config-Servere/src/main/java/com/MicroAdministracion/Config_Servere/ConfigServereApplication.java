package com.MicroAdministracion.Config_Servere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer; 



@EnableConfigServer

@SpringBootApplication
public class ConfigServereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServereApplication.class, args);
	}

}
