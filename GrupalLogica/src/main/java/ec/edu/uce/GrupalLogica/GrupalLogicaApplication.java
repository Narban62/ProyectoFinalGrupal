package ec.edu.uce.GrupalLogica;

import ec.edu.uce.GrupalLogica.view.AdminLoginGUI;
import ec.edu.uce.GrupalLogica.view.AdminRegistroGUI;
import ec.edu.uce.GrupalLogica.view.JFrameRegistr;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GrupalLogicaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(
				GrupalLogicaApplication.class).headless(false).run(args);

		// Obtén la instancia de AdminLoginGUI o AdminRegistroGUI desde el contexto de Spring
//		AdminLoginGUI loginGUI = context.getBean(AdminLoginGUI.class);
//		loginGUI.setVisible(true); // Asegura que el JFrame se haga visible

		// Si deseas iniciar con AdminRegistroGUI, descomenta las siguientes líneas
//		 AdminRegistroGUI registerFrame = context.getBean(AdminRegistroGUI.class);
//		 registerFrame.setVisible(true);

		JFrameRegistr frame = context.getBean(JFrameRegistr.class);
		frame.setVisible(true);
	}
}
