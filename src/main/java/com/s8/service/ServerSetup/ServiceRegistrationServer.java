package com.s8.service.ServerSetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Sourabh_Sethi on 5/1/2016.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {
    public static void main(String[] args) {
        // Tell Boot to look for registration-server.yml
        System.setProperty("spring.config.name", "registration-server");
        SpringApplication.run(ServiceRegistrationServer.class, args);
    }
}
