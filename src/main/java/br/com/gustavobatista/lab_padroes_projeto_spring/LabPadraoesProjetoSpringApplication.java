package br.com.gustavobatista.lab_padroes_projeto_spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadraoesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadraoesProjetoSpringApplication.class, args);
	}

}
