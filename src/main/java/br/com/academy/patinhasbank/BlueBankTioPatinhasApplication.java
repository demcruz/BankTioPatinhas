package br.com.academy.patinhasbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class BlueBankTioPatinhasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueBankTioPatinhasApplication.class, args);
	}

}
