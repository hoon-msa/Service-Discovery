package com.example.ecoomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //유레카 서버 역할 등록
public class EcoomerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoomerceApplication.class, args);
    }

}
