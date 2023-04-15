package com.example.employeemanager;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;


import java.util.Arrays;
import java.util.Collections;


@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}

	// CORS - Configuration



}
