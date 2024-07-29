package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.Services.FabricaService;
import ec.edu.uce.GrupalLogica.Services.ProductoService;
import ec.edu.uce.GrupalLogica.controller.ProductObserver;
import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class JFrameAdmin extends JDialog {
    private JPanel jPanel1;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5;
    private JTextField txtPrecioCamisa, txtPrecioVestido, txtPrecioBlusa, txtPrecioChaleco, txtPrecioFalda, txtPrecioPantalon;
    private JButton btnGuardar, btnActualizar, btnCancelar;

    public JFrameAdmin(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        txtPrecioCamisa = new JTextField();
        txtPrecioVestido = new JTextField();
        txtPrecioBlusa = new JTextField();
        txtPrecioChaleco = new JTextField();
        txtPrecioFalda = new JTextField();
        txtPrecioPantalon = new JTextField();
        btnGuardar = new JButton();
        btnActualizar = new JButton();
        btnCancelar = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(204, 255, 204));

        jLabel1.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        jLabel1.setText("Camisa:");

        jLabel2.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        jLabel2.setText("Vestido:");

        jLabel3.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        jLabel3.setText("Blusa:");

        jLabel4.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        jLabel4.setText("Chaleco:");

        jLabel5.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        jLabel5.setText("Falda:");

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPrecioCamisa, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(txtPrecioVestido)
                                        .addComponent(txtPrecioBlusa)
                                        .addComponent(txtPrecioChaleco)
                                        .addComponent(txtPrecioFalda)
                                        .addComponent(txtPrecioPantalon))
                                .addContainerGap(30, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnGuardar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnActualizar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtPrecioCamisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtPrecioVestido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtPrecioBlusa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtPrecioChaleco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtPrecioFalda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, BorderLayout.CENTER);
        pack();
    }

    private void btnGuardarMouseClicked(MouseEvent evt) {
        // Your code here
    }

    private void btnActualizarMouseClicked(MouseEvent evt) {
        // Your code here
    }

    private void btnCancelarMouseClicked(MouseEvent evt) {
        // Your code here
    }
}


