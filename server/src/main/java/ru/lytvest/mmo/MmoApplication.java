package ru.lytvest.mmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MmoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmoApplication.class, args);
	}

}
