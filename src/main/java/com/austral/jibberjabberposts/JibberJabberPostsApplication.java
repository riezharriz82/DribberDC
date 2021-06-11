package com.austral.jibberjabberposts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class JibberJabberPostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JibberJabberPostsApplication.class, args);
	}
}
