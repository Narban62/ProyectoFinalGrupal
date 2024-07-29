package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.controller.Container;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component
public class JFrameAdmin extends JFrame {

    Container container;
    // Botones
    private JButton bntRegistrarNuevoAdmin;
    private JButton btnAgregarProductoNuevo;
    private JButton btnAprobarPedido;
    private JButton btnNegarPedido;
    private JButton btnPrecio;

    // Etiquetas
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel labelAgrNueProduc;
    private JLabel labelClientesFila;
    private JLabel labelPedidosAprobados;
    private JLabel labelPedidosRechazados;
    private JLabel labelPrecio;
    private JLabel labelProductoNuevo;

    // Paneles
    private JPanel jPanel1;
    private JPanel panelClienteFila;
    private JPanel panelNombreAdmin;
    private JPanel panelPedidosRechazados;
    private JPanel panelProductosAprobados;

    // Campos de texto
    private JTextField txtPrecio;
    private JTextField txtProductoNuevo;


    public JFrameAdmin(Container container) {
        this.container = container;
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        labelClientesFila = new JLabel();
        panelClienteFila = new JPanel();
        bntRegistrarNuevoAdmin = new JButton();
        jLabel4 = new JLabel();
        panelNombreAdmin = new JPanel();
        btnNegarPedido = new JButton();
        btnAprobarPedido = new JButton();
        labelAgrNueProduc = new JLabel();
        txtProductoNuevo = new JTextField();
        btnAgregarProductoNuevo = new JButton();
        txtPrecio = new JTextField();
        btnPrecio = new JButton();
        labelProductoNuevo = new JLabel();
        labelPrecio = new JLabel();
        panelProductosAprobados = new JPanel();
        panelPedidosRechazados = new JPanel();
        labelPedidosAprobados = new JLabel();
        labelPedidosRechazados = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(169, 216, 232));

        labelClientesFila.setFont(new Font("Segoe UI", Font.ITALIC, 18));
        labelClientesFila.setText("Clientes en la Fila");

        GroupLayout panelClienteFilaLayout = new GroupLayout(panelClienteFila);
        panelClienteFila.setLayout(panelClienteFilaLayout);
        panelClienteFilaLayout.setHorizontalGroup(
                panelClienteFilaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 293, Short.MAX_VALUE)
        );
        panelClienteFilaLayout.setVerticalGroup(
                panelClienteFilaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 321, Short.MAX_VALUE)
        );

        bntRegistrarNuevoAdmin.setText("Registrar Nuevo Administrador");
        bntRegistrarNuevoAdmin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                bntRegistrarNuevoAdminMouseClicked(evt);
            }
        });
        bntRegistrarNuevoAdmin.addActionListener(e -> bntRegistrarNuevoAdminActionPerformed(e));

        GroupLayout panelNombreAdminLayout = new GroupLayout(panelNombreAdmin);
        panelNombreAdmin.setLayout(panelNombreAdminLayout);
        panelNombreAdminLayout.setHorizontalGroup(
                panelNombreAdminLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 185, Short.MAX_VALUE)
        );
        panelNombreAdminLayout.setVerticalGroup(
                panelNombreAdminLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE)
        );

        btnNegarPedido.setText("Negar Pedido");
        btnNegarPedido.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnNegarPedidoMouseClicked(evt);
            }
        });
        btnNegarPedido.addActionListener(e -> btnNegarPedidoActionPerformed(e));

        btnAprobarPedido.setText("Aprobar Pedido");
        btnAprobarPedido.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnAprobarPedidoMouseClicked(evt);
            }
        });
        btnAprobarPedido.addActionListener(e -> btnAprobarPedidoActionPerformed(e));

        labelAgrNueProduc.setFont(new Font("Segoe UI", Font.ITALIC, 18));
        labelAgrNueProduc.setText("Agregar Nuevo Producto");

        txtProductoNuevo.addActionListener(e -> txtProductoNuevoActionPerformed(e));

        btnAgregarProductoNuevo.setText("Agregar Producto");
        btnAgregarProductoNuevo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnAgregarProductoNuevoMouseClicked(evt);
            }
        });
        btnAgregarProductoNuevo.addActionListener(e -> btnAgregarProductoNuevoActionPerformed(e));

        btnPrecio.setText("Agregar Precio");
        btnPrecio.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnPrecioMouseClicked(evt);
            }
        });

        labelProductoNuevo.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        labelProductoNuevo.setText("Producto Nuevo");

        labelPrecio.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        labelPrecio.setText("Precio");

        GroupLayout panelProductosAprobadosLayout = new GroupLayout(panelProductosAprobados);
        panelProductosAprobados.setLayout(panelProductosAprobadosLayout);
        panelProductosAprobadosLayout.setHorizontalGroup(
                panelProductosAprobadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 172, Short.MAX_VALUE)
        );
        panelProductosAprobadosLayout.setVerticalGroup(
                panelProductosAprobadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        GroupLayout panelPedidosRechazadosLayout = new GroupLayout(panelPedidosRechazados);
        panelPedidosRechazados.setLayout(panelPedidosRechazadosLayout);
        panelPedidosRechazadosLayout.setHorizontalGroup(
                panelPedidosRechazadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 157, Short.MAX_VALUE)
        );
        panelPedidosRechazadosLayout.setVerticalGroup(
                panelPedidosRechazadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 202, Short.MAX_VALUE)
        );

        labelPedidosAprobados.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        labelPedidosAprobados.setText("Pedidos Aprobados");

        labelPedidosRechazados.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        labelPedidosRechazados.setText("Pedidos Rechazados");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(panelClienteFila, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(btnAprobarPedido)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNegarPedido))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addComponent(labelClientesFila)))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addComponent(labelAgrNueProduc))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelProductoNuevo)
                                                        .addComponent(labelPrecio))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtProductoNuevo, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnAgregarProductoNuevo)
                                                        .addComponent(btnPrecio))))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(panelProductosAprobados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelPedidosRechazados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(labelPedidosAprobados)
                                                .addGap(58, 58, 58)
                                                .addComponent(labelPedidosRechazados)))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelClientesFila)
                                        .addComponent(labelAgrNueProduc))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelClienteFila, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelProductoNuevo)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtProductoNuevo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelPrecio)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAgregarProductoNuevo)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPrecio))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnAprobarPedido)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNegarPedido)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPedidosAprobados)
                                        .addComponent(labelPedidosRechazados))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelProductosAprobados, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelPedidosRechazados, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void bntRegistrarNuevoAdminMouseClicked(MouseEvent evt) {

    }

    private void bntRegistrarNuevoAdminActionPerformed(ActionEvent evt) {

    }

    private void btnNegarPedidoMouseClicked(MouseEvent evt) {

    }

    private void btnNegarPedidoActionPerformed(ActionEvent evt) {

    }

    private void btnAprobarPedidoMouseClicked(MouseEvent evt) {

    }

    private void btnAprobarPedidoActionPerformed(ActionEvent evt) {

    }

    private void txtProductoNuevoActionPerformed(ActionEvent evt) {

    }

    private void btnAgregarProductoNuevoMouseClicked(MouseEvent evt) {
        String nombreProducto = txtProductoNuevo.getText();
        double precioProducto = Double.parseDouble(txtPrecio.getText());
        String resultado = container.saveProduct(nombreProducto, precioProducto);
        JOptionPane.showMessageDialog(this, resultado);

    }

    private void btnAgregarProductoNuevoActionPerformed(ActionEvent evt) {

    }

    private void btnPrecioMouseClicked(MouseEvent evt) {
    }
}

