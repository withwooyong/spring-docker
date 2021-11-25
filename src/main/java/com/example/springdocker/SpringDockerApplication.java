package com.example.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://spring.io/guides/gs/spring-boot-docker/
 * mvn clean package
 * ./mvnw clean package
 * java -jar target/spring-docker-0.0.1.jar
 * java -jar .\target\spring-docker-0.0.1-SNAPSHOT.jar
 * http://localhost:8080/
 * Dockerfile
 * PS D:\work\spring-docker> docker build -t spring-docker .
 * docker images
 * docker run -d -p 8080:8080 spring-docker
 * docker ps
 * docker stop <container_id>
 *   pom.xml 설정 io.fabric8
 * mvn docker:build
 * mvn clean install
 * mvn docker:push
 * docker run -d -p 8080:8080 withwooyong/spring-docker
 */
@SpringBootApplication
@RestController
public class SpringDockerApplication {

	@GetMapping("/")
	public String hello() {
		System.out.println("hello");
		return "hello spring-docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
