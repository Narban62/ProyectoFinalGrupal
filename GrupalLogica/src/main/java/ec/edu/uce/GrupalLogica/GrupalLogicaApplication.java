package ec.edu.uce.GrupalLogica;

import ec.edu.uce.GrupalLogica.view.ClienteRegister;
import ec.edu.uce.GrupalLogica.view.ClienteVista;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GrupalLogicaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(
                GrupalLogicaApplication.class).headless(false).run(args);

//        JFrameRegistr appFrame = context.getBean(JFrameRegistr.class);
//        appFrame.setVisible(true);

        ClienteVista appFrame = context.getBean(ClienteVista.class);
        appFrame.setVisible(true);

    }
}
