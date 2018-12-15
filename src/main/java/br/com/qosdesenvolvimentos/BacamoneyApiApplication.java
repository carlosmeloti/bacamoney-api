package br.com.qosdesenvolvimentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.qosdesenvolvimentos.config.property.BacaMoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(BacaMoneyApiProperty.class)
public class BacamoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BacamoneyApiApplication.class, args);
	}
}
