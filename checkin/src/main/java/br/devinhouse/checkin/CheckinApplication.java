package br.devinhouse.checkin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CheckinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckinApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(Aplicacao aplicacao) {
		return args -> {
			aplicacao.iniciar();
		};
	}

}
