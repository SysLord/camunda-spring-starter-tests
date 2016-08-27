package de.syslord.camunda.boot;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.spring.boot.starter.SpringBootProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ProcessApplication
@EnableWebMvc
@EnableAutoConfiguration
public class Application extends SpringBootProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
