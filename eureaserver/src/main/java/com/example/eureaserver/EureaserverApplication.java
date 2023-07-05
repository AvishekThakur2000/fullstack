package com.example.eureaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEureakaServer
public class EureaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureaserverApplication.class, args);
    }

}
