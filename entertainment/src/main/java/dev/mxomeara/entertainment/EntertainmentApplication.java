package dev.mxomeara.entertainment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EntertainmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntertainmentApplication.class, args);
	}
}
