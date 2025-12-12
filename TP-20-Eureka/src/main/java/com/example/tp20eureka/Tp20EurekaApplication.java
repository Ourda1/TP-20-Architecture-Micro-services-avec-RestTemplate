package com.example.tp20eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tp20EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp20EurekaApplication.class, args);
    }

}
