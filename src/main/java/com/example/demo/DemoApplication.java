package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		String url = System.getenv("SPRING_DATASOURCE_URL");
		System.out.println(url);

		// INFOレベルのログを出力
		logger.info("This is an INFO message");

		// WARNレベルのログを出力
		logger.warn("This is a WARN message");

		// ERRORレベルのログを出力
		logger.error("This is an ERROR message");

		SpringApplication.run(DemoApplication.class, args);
	}

}
