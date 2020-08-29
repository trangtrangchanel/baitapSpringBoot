package com.anhduc.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages= {"com.anhduc.service.SmpService"})

public class Aplication {
	public static void main(String[] args) {
        SpringApplication.run(Aplication.class, args);
    }
}
