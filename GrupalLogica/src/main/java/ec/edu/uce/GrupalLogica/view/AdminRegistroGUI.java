package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.Services.AdminService;
import ec.edu.uce.GrupalLogica.model.entidades.Admin;
import ec.edu.uce.GrupalLogica.model.interfaces.IAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@Component
public class AdminRegistroGUI extends JFrame {

    @Autowired
    private AdminService adminService;

    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField emailField;
    private JPasswordField passwordField;
//    private IAdmin admin;

    public AdminRegistroGUI() {

        initializeUI();
    }

    private void initializeUI() {
        setTitle("Registro de Admin");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Creación de componentes de la interfaz gráfica
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminService.save(new Admin(nombreField.getText(), apellidoField.getText(), emailField.getText(), new String(passwordField.getPassword())));
            }
        });

        // Agregar componentes a la interfaz
        add(nombreLabel);
        add(nombreField);
        add(apellidoLabel);
        add(apellidoField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Espacio vacío
        add(registrarButton);

        setLocationRelativeTo(null); // Centrar la ventana
    }

}
