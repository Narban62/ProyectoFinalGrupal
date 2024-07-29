package ec.edu.uce.GrupalLogica.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class JFrameLogin extends JDialog {

    private JButton btnInicSesion;
    private JButton btnRegistro;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLogo;
    private JPanel jPanel1;
    private JPasswordField textPassword;
    private JTextField txtUsuario;

    public JFrameLogin(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLogo = new JLabel();
        txtUsuario = new JTextField();
        textPassword = new JPasswordField();
        btnInicSesion = new JButton();
        btnRegistro = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(153, 255, 204));
        jPanel1.setFocusTraversalPolicyProvider(true);

        jLogo.setIcon(new ImageIcon(getClass().getResource("/LogEmpresa.png"))); // NOI18N
        jLogo.setAutoscrolls(true);
        jLogo.setPreferredSize(new Dimension(142, 100));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jLabel2.setText("PASSWORD");
        jLabel3.setText("USUARIO");

        txtUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnInicSesion.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btnInicSesion.setText("Iniciar Sesión");
        btnInicSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnInicSesionActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLogo, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(textPassword, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(75, 75, 75)
                                                                .addComponent(jLabel1))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(btnInicSesion, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(214, 214, 214))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnRegistro, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLogo, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnRegistro, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel1)
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(textPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addComponent(btnInicSesion, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    // Métodos para manejar eventos
    private void txtUsuarioActionPerformed(ActionEvent evt) {
        // TODO: Add your handling code here
    }

    private void btnInicSesionActionPerformed(ActionEvent evt) {
        // TODO: Add your handling code here
    }

    private void btnRegistroActionPerformed(ActionEvent evt) {
        // TODO: Add your handling code here
    }


}