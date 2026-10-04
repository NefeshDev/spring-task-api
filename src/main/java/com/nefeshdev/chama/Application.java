package com.nefeshdev.chama;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplicationBuilder sb = new SpringApplicationBuilder(Application.class);
		sb.bannerMode(Mode.OFF);
		// sb.environment();
		// SpringApplication.run(ChamaApplication.class, args);
		sb.run(args);
	}

}
