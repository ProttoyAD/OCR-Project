package com.example.ocr.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@SpringBootApplication
public class OcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrApplication.class, args);
	}



}