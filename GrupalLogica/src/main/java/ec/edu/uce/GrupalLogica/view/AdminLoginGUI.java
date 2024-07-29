package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.controller.Container;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class AdminLoginGUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private Container container;

    public AdminLoginGUI(Container container) {
        this.container = container;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Admin Login");
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(userLabel, gbc);

        usernameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(passwordLabel, gbc);

        passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(passwordField, gbc);

        loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginButton.addActionListener(e -> {
            String email = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String result = container.authenticateAdmin(email, password);
            JOptionPane.showMessageDialog(this, result);
        });
        panel.add(loginButton, gbc);
    }
}