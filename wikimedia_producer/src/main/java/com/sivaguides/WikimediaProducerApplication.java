package com.sivaguides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WikimediaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WikimediaProducerApplication.class,args);
        System.out.println("**WIKIMEDIA_PRODUCER_APPLICATION");
    }
}
