package com.example.buyermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BuyermicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuyermicroserviceApplication.class, args);
    }

}
