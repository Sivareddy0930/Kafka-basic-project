package com.sivaguides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaWikimediaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaWikimediaProjectApplication.class, args);
		System.out.println("\n***KAFKA_WIKIMEDIA****\n");
	}

}
