package com.MicroAdministracion.RegistrarLote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication 
@EnableDiscoveryClient 



public class RegistrarLoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrarLoteApplication.class, args);
	}

}
