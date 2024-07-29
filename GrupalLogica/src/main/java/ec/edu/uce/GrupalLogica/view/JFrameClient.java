package ec.edu.uce.GrupalLogica.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameClient extends JDialog {
    JButton btnCarrito1,btnCarrito2,btnCarrito3,btnCarrito4,btnCarrito5,btnCarrito6,btnEliminarProduc,btnPagar;
    JButton btnRealizarPedido, jButton3,jButton6;
    JComboBox<String> jComboBox2;
    JLabel jLabel1,jLabel10,jLabel13,jLabel2,jLabel3,jLabel4,jLabel6,jLabel7,jLabel8,jLabel9;
    JPanel jPanel1;
    JPanel panelDescPedido;
    JPanel panelFactura;
    JTextField txtBlusa,txtCamisa,txtChaleco , txtFalda, txtPantalon, txtVestido;
    JLabel txtDescPedido;
    JLabel txtFactura;

    JLabel txtFrase;

    JPanel txtTotal;


        public JFrameClient(Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {
            jButton3 = new JButton();
            jButton6 = new JButton();
            jPanel1 = new JPanel();
            jLabel1 = new JLabel();
            jLabel4 = new JLabel();
            jLabel3 = new JLabel();
            txtFrase = new JLabel();
            jLabel2 = new JLabel();
            jLabel7 = new JLabel();
            jLabel8 = new JLabel();
            txtVestido = new JTextField();
            jLabel9 = new JLabel();
            btnCarrito2 = new JButton();
            txtFalda = new JTextField();
            txtCamisa = new JTextField();
            txtBlusa = new JTextField();
            txtChaleco = new JTextField();
            txtPantalon = new JTextField();
            btnCarrito1 = new JButton();
            btnCarrito3 = new JButton();
            btnCarrito4 = new JButton();
            btnCarrito5 = new JButton();
            btnCarrito6 = new JButton();
            btnRealizarPedido = new JButton();
            jLabel6 = new JLabel();
            btnEliminarProduc = new JButton();
            jLabel10 = new JLabel();
            jComboBox2 = new JComboBox<>();
            txtFactura = new JLabel();
            panelDescPedido = new JPanel();
            txtDescPedido = new JLabel();
            panelFactura = new JPanel();
            btnPagar = new JButton();
            txtTotal = new JPanel();
            jLabel13 = new JLabel();


            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            jPanel1.setBackground(new Color(255, 204, 204));
            jPanel1.setFocusTraversalPolicyProvider(true);

            jLabel1.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel1.setText("Camisa");

            jLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 15));

            jLabel3.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel3.setText("Blusa");

            txtFrase.setFont(new Font("Serif", Font.ITALIC, 24));
            txtFrase.setText("LO ÚLTIMO EN MODA!!");

            jLabel2.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel2.setText("Vestido");

            jLabel7.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel7.setText("Chaleco");

            jLabel8.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel8.setText("Falda");

            txtVestido.addActionListener(evt -> txtVestidoActionPerformed(evt));

            jLabel9.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel9.setText("Pantalón");

            btnCarrito2.setText("Agregar al Carrito");
            btnCarrito2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnCarrito2MouseClicked(evt);
                }
            });

            txtFalda.addActionListener(evt -> txtFaldaActionPerformed(evt));

            txtCamisa.addActionListener(evt -> txtCamisaActionPerformed(evt));

            txtBlusa.addActionListener(evt -> txtBlusaActionPerformed(evt));

            txtChaleco.addActionListener(evt -> txtChalecoActionPerformed(evt));

            txtPantalon.addActionListener(evt -> txtPantalonActionPerformed(evt));

            btnCarrito1.setText("Agregar al Carrito");
            btnCarrito1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnCarrito1MouseClicked(evt);
                }
            });

            btnCarrito3.setText("Agregar al Carrito");
            btnCarrito3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnCarrito3MouseClicked(evt);
                }
            });

            btnCarrito4.setText("Agregar al Carrito");
            btnCarrito4.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnCarrito4MouseClicked(evt);
                }
            });

            btnCarrito5.setText("Agregar al Carrito");
            btnCarrito5.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnCarrito5MouseClicked(evt);
                }
            });
            btnCarrito5.addActionListener(evt -> btnCarrito5ActionPerformed(evt));

            btnCarrito6.setText("Agregar al Carrito");
            btnCarrito6.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnCarrito6MouseClicked(evt);
                }
            });
            btnCarrito6.addActionListener(evt -> btnCarrito6ActionPerformed(evt));

            btnRealizarPedido.setText("Realizar Pedido");
            btnRealizarPedido.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnRealizarPedidoMouseClicked(evt);
                }
            });
            btnRealizarPedido.addActionListener(evt -> btnRealizarPedidoActionPerformed(evt));

            jLabel6.setFont(new Font("Segoe UI", Font.ITALIC, 15));
            jLabel6.setText("Método Pago");

            btnEliminarProduc.setText("Eliminar Producto");
            btnEliminarProduc.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    btnEliminarProducMouseClicked(evt);
                }
            });
            btnEliminarProduc.addActionListener(evt -> btnEliminarProducActionPerformed(evt));

            jLabel10.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            jLabel10.setText("TOTAL..");

            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Pago Efectivo", "Pago Tarjeta"}));
            jComboBox2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    jComboBox2MouseClicked(evt);
                }
            });

            txtFactura.setFont(new Font("Segoe UI", 3, 18));
            txtFactura.setText("Factura");

            javax.swing.GroupLayout panelDescPedidoLayout = new javax.swing.GroupLayout(panelDescPedido);
            panelDescPedido.setLayout(panelDescPedidoLayout);
            panelDescPedidoLayout.setHorizontalGroup(
                    panelDescPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 355, Short.MAX_VALUE)
            );
            panelDescPedidoLayout.setVerticalGroup(
                    panelDescPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 146, Short.MAX_VALUE)
            );

            txtDescPedido.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
            txtDescPedido.setText("Descripción del Pedido");

            javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
            panelFactura.setLayout(panelFacturaLayout);
            panelFacturaLayout.setHorizontalGroup(
                    panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 355, Short.MAX_VALUE)
            );
            panelFacturaLayout.setVerticalGroup(
                    panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 146, Short.MAX_VALUE)
            );

            btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            btnPagar.setText("Pagar");
            btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnPagarMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout txtTotalLayout = new javax.swing.GroupLayout(txtTotal);
            txtTotal.setLayout(txtTotalLayout);
            txtTotalLayout.setHorizontalGroup(
                    txtTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 93, Short.MAX_VALUE)
            );
            txtTotalLayout.setVerticalGroup(
                    txtTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 25, Short.MAX_VALUE)
            );

            jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
            jLabel13.setText("$");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel7)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel3)
                                                                            .addComponent(jLabel6))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(jLabel4))
                                                            .addComponent(jLabel9))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(txtCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(txtVestido, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(txtFalda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(txtChaleco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(txtPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(txtBlusa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(56, 56, 56)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(btnCarrito2)
                                                                            .addComponent(btnCarrito3)
                                                                            .addComponent(btnCarrito1))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(panelDescPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(40, 40, 40))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGap(140, 140, 140)
                                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addComponent(btnRealizarPedido)
                                                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(btnCarrito5)
                                                                                                    .addComponent(btnCarrito4)
                                                                                                    .addComponent(btnCarrito6))))
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                    .addGap(51, 51, 51)
                                                                                    .addComponent(btnEliminarProduc)))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(txtFactura)
                                                                                    .addGap(193, 193, 193))
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(panelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addGap(51, 51, 51))
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                    .addComponent(jLabel13)
                                                                                    .addGap(153, 153, 153))))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtDescPedido)
                                                    .addGap(120, 120, 120))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(230, 230, 230)
                                    .addComponent(btnPagar)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(29, 29, 29)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(34, 34, 34)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel2)
                                                            .addComponent(txtVestido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnCarrito2))
                                                    .addGap(21, 21, 21)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel8)
                                                            .addComponent(txtFalda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnCarrito3))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jLabel7))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGap(22, 22, 22)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(txtChaleco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(btnCarrito4))
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jLabel4)
                                                                    .addGap(0, 0, 0)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(jLabel9)
                                                                            .addComponent(txtPantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(btnCarrito5))))
                                                    .addGap(26, 26, 26)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(txtBlusa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel3)
                                                            .addComponent(btnCarrito6))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnEliminarProduc)
                                                    .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(37, 37, 37)
                                                    .addComponent(txtDescPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(btnCarrito1)
                                                            .addComponent(panelDescPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(32, 32, 32)
                                                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(panelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(78, 78, 78))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnRealizarPedido)
                                                            .addComponent(jLabel6))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnPagar)
                                                    .addGap(44, 44, 44))))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );

            pack();
        }

    private void txtVestidoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtFaldaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtCamisaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtBlusaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtChalecoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtPantalonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCarrito5ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnCarrito6ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnEliminarProducActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnCarrito1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnCarrito2MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnCarrito3MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnCarrito5MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnCarrito4MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnCarrito6MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnEliminarProducMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnRealizarPedidoMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void btnPagarMouseClicked(java.awt.event.MouseEvent evt) {

    }

    }

