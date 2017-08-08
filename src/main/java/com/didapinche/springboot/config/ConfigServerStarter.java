package com.didapinche.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by leiyang on 17-8-8.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerStarter.class, args);
    }
}
