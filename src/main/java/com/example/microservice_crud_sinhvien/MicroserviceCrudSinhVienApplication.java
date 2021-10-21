package com.example.microservice_crud_sinhvien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceCrudSinhVienApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCrudSinhVienApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){return new RestTemplate();}

}
