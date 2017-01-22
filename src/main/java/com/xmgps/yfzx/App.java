package com.xmgps.yfzx;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JiKai Lin on 2017/1/18.
 */
@EnableAutoConfiguration
@Configuration
@EnableAdminServer
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
