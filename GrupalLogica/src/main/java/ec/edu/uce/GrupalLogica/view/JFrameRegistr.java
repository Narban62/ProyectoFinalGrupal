package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.Services.AdminService;
import ec.edu.uce.GrupalLogica.controller.Container;
import ec.edu.uce.GrupalLogica.model.entidades.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

@Component
public class JFrameRegistr extends JFrame {

    @Autowired
    private AdminService adminService;

    Container container;

    private JTextField txtNombre;
    private JTextField txtApellido1;
    private JTextField txtEmail;
    private JPasswordField jPassword;
    private JButton btnInicSesion;

    public JFrameRegistr(Container container) {
        this.container = container;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLogos = new JLabel();
        txtNombre = new JTextField();
        txtApellido1 = new JTextField();
        txtEmail = new JTextField();
        jPassword = new JPasswordField();
        btnInicSesion = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 204, 255));
        jPanel1.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new Font("Segoe UI", 0, 15));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new Font("Segoe UI", 0, 15));
        jLabel2.setText("Apellido");

        btnInicSesion.setFont(new Font("Segoe UI", 0, 18));
        btnInicSesion.setText("Crear Cuenta");
        btnInicSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnInicSesionActionPerformed(evt);
            }
        });

        jLogos.setIcon(new ImageIcon(getClass().getResource("/LogEmpresa.png"))); // NOI18N
        jLogos.setAutoscrolls(true);
        jLogos.setPreferredSize(new Dimension(142, 100));

        jLabel3.setFont(new Font("Segoe UI", 0, 15));
        jLabel3.setText("Email");

        jLabel4.setFont(new Font("Segoe UI", 0, 15));
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new Font("Segoe UI", 0, 24));
        jLabel5.setText("NUEVO REGISTRO");

        txtNombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLogos, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(48, 48, 48)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtApellido1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jPassword, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(66, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(btnInicSesion, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLogos, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                .addGap(46, 46, 46)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtApellido1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jPassword, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                                .addGap(58, 58, 58)
                                                .addComponent(btnInicSesion, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void btnInicSesionActionPerformed(ActionEvent evt) {
        // Lógica para registrar un nuevo administrador
        String nombre = txtNombre.getText();
        String apellido = txtApellido1.getText();
        String email = txtEmail.getText();
        String password = new String(jPassword.getPassword());


        container.registerAdmin(nombre, apellido, email, password);

        JOptionPane.showMessageDialog(this, "Administrador registrado con éxito.");
        this.dispose(); // Cerrar la ventana después de registrar
    }

    private void btnInicSesionMouseClicked(MouseEvent evt) {
        // Este método puede estar vacío si la acción está manejada por btnInicSesionActionPerformed
    }

    private void txtNombreActionPerformed(ActionEvent evt) {
        // Acción cuando se presiona Enter en el campo "Nombre"
    }

    private void txtApellido1ActionPerformed(ActionEvent evt) {
        // Acción cuando se presiona Enter en el campo "Apellido"
    }

    private void txtEmailActionPerformed(ActionEvent evt) {
        // Acción cuando se presiona Enter en el campo "Email"
    }
}
