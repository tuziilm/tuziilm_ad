package com.tuziilm.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: <a href="tuziilm@gmail.com">tuziilm</a>
 * @Date 2019/3/14
 **/
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class SponsorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SponsorApplication.class, args);
    }
}
