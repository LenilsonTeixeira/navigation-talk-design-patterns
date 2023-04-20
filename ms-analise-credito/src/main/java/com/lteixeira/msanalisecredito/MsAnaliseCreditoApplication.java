package com.lteixeira.msanalisecredito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsAnaliseCreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAnaliseCreditoApplication.class, args);
	}

}
