package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.controller.Container;

import javax.swing.*;

public class AdminLoginGUI {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private Container container;

    public AdminLoginGUI(Container container) {
        this.container = container;
        // Configurar componentes de la interfaz gráfica
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Agregar listeners a los botones, etc.
        loginButton.addActionListener(e -> {
            String email = usernameField.getText();
            String password = new String(passwordField.getPassword());
            container.authenticateAdmin(email, password);
        });
    }
}