package de.syslord.camunda.boot;

import java.sql.SQLException;

import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("de.syslord.camunda")
@Configuration
public class Config {

	// Maps /rest for camunda
	@Bean
	public ResourceConfig jerseyConfig() {
		return new CamundaJerseyResourceConfig();
	}

	// H2 web console will be accessible via http://localhost:8082/
	@Bean(initMethod = "start", destroyMethod = "stop")
	public org.h2.tools.Server h2WebConsonleServer() throws SQLException {
		return org.h2.tools.Server.createWebServer("-web", "-webAllowOthers", "-webDaemon", "-webPort", "8082");
	}

}
