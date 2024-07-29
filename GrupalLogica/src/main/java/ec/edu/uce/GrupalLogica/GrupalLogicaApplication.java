package ec.edu.uce.GrupalLogica;

import ec.edu.uce.GrupalLogica.view.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class GrupalLogicaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(
                GrupalLogicaApplication.class).headless(false).run(args);

        SwingUtilities.invokeLater(() -> {
            JFrameLoginAdmin appFrame = context.getBean(JFrameLoginAdmin.class);
            appFrame.setVisible(true);

        });


        SwingUtilities.invokeLater(() -> {
            JFrameLoginClient appFrame = context.getBean(JFrameLoginClient.class);
            appFrame.setVisible(true);

        });

//        ClienteVista appFrame = context.getBean(ClienteVista.class);
//        appFrame.setVisible(true);

//        ClienteVista appFrame = context.getBean(ClienteVista.class);
////        appFrame.setVisible(true);

    }
}
