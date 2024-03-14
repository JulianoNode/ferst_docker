package com.JMR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);

		System.out.println("Construindo o JAR FILE "
				+ "C:> mvn clean package -DskipTests");
		System.out.println("Construindo a Docker Image "
				+ "C:> docker build -t hello-doker:0.0.2-SNAPSHOT");
	}

}
