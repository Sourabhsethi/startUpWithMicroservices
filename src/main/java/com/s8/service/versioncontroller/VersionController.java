package com.s8.service.versioncontroller; /**
 * Created by Sourabh_Sethi on 5/1/2016.
 */

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@EnableAutoConfiguration
@EnableDiscoveryClient
public class VersionController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Version 1";
    }

    public static void main(String[] args) {
        // Will configure using version-server.yml
        System.setProperty("spring.config.name", "version-server");

        SpringApplication.run(VersionController.class, args);
    }
}
