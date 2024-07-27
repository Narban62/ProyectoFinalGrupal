package ec.edu.uce.GrupalLogica;

import ec.edu.uce.GrupalLogica.Services.UserService;
import ec.edu.uce.GrupalLogica.model.entidades.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrupalLogicaApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(GrupalLogicaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		userService.save(new User( "Juan","jun@gmail.com","1234","cliente"));

	}
}
