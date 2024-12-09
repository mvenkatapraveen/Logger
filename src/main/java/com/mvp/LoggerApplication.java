package com.mvp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication {
	private static final Logger log = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
		System.out.println("Hello");
		
		for(int i=0; i<10000;i++) {
			log.info(i+" : Successfully logged info data");
			log.debug(i+" : Successfully logged debug data");
			log.warn(i+" : Successfully logged warn data");
			log.error(i+" : Successfully logged error data");
			log.trace(i+" : Successfully logged trace data");
		}
		System.out.println("Bye");
	}

}
