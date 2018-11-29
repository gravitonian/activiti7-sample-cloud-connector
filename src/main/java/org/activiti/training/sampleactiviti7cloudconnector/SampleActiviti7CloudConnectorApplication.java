package org.activiti.training.sampleactiviti7cloudconnector;

import org.activiti.cloud.connectors.starter.configuration.EnableActivitiCloudConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableActivitiCloudConnector
@ComponentScan({"org.activiti.cloud.connectors.starter","org.activiti.training.sampleactiviti7cloudconnector","org.activiti.cloud.services.common.security"})
public class SampleActiviti7CloudConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleActiviti7CloudConnectorApplication.class, args);
	}
}
