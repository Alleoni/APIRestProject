package br.com.grupo6.projetoGrupo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoGrupo6Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoGrupo6Application.class, args);
	}

}
