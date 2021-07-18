package com.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Stone
 * @Date: 2021/7/18
 * @Version:
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeApplication.class, args);
    }

}
