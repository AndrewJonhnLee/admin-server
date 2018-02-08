package com.admin.server;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class ServerApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ServerApplication.class);
		app.setAddCommandLineProperties(false);
		app.run(args);

//		new SpringApplicationBuilder()
//				.sources(Parent.class)
//				.child(Application.class)
//				.bannerMode(Banner.Mode.OFF)
//				.run(args);

//		ConfigurableApplicationContext context= SpringApplication.run(ClientApplication.class, args);
//
//		KafkaSender sender = context.getBean(KafkaSender.class);

	}
}
