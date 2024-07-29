package ec.edu.uce.GrupalLogica.view;

import ec.edu.uce.GrupalLogica.Services.ProductService;
import ec.edu.uce.GrupalLogica.controller.Container;
import ec.edu.uce.GrupalLogica.model.entidades.Client;
import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

@Component
public class ClienteVista extends JFrame {

    private JPanel panelPrincipal;
    private JTextArea taCarrito;
    private JButton btnAgregarCarrito;
    private JButton btnRealizarPedido;
    private JButton btnPagar;
    private JButton btnBuscar;
    private JButton btnMostrarProductos;
    private JComboBox<String> cbProductos;
    private JLabel lblProductos;

    private Container container;
    private ProductService productService;

    private JPanel panelProductos;
    private JTextArea taProductos;
    private Client currentClient;

    // Constructor
    public ClienteVista(Container container, ProductService productService) {
        this.container = container;
        this.productService = productService;
        System.out.println("Container: " + container);
        System.out.println("ProductService: " + productService);
        setTitle("Vista del Cliente");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuración del panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        add(panelPrincipal);

        // Inicialización de los componentes
        initializeComponents();

        // Configuración de los eventos
        initializeEvents();
    }

    // Inicializa los componentes gráficos
    private void initializeComponents() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        lblProductos = new JLabel("Productos:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelPrincipal.add(lblProductos, gbc);

        cbProductos = new JComboBox<>();
        gbc.gridx = 1;
        panelPrincipal.add(cbProductos, gbc);

        btnAgregarCarrito = new JButton("Agregar al Carrito");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelPrincipal.add(btnAgregarCarrito, gbc);

        taCarrito = new JTextArea(5, 30);
        taCarrito.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taCarrito);
        gbc.gridx = 1;
        panelPrincipal.add(scrollPane, gbc);

        btnRealizarPedido = new JButton("Realizar Pedido");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelPrincipal.add(btnRealizarPedido, gbc);

        btnPagar = new JButton("Pagar");
        gbc.gridx = 1;
        panelPrincipal.add(btnPagar, gbc);

        btnBuscar = new JButton("Buscar");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelPrincipal.add(btnBuscar, gbc);

        btnMostrarProductos = new JButton("Mostrar Productos");
        gbc.gridx = 1;
        panelPrincipal.add(btnMostrarProductos, gbc);

        // Configuración del panel de productos
        panelProductos = new JPanel();
        panelProductos.setLayout(new BorderLayout());
        taProductos = new JTextArea();
        taProductos.setEditable(false);
        JScrollPane scrollPaneProductos = new JScrollPane(taProductos);
        panelProductos.add(scrollPaneProductos, BorderLayout.CENTER);
    }

    // Inicializa los eventos
    private void initializeEvents() {
        btnAgregarCarrito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar al carrito
                String productoSeleccionado = getSelectedProduct();
                if (productoSeleccionado != null && currentClient != null) {
                    Product producto = productService.searchProductByName(productoSeleccionado);
                    if (producto != null) {
                        String resultado = container.addToCart(currentClient, producto);
                        JOptionPane.showMessageDialog(null, resultado);
                        appendCarrito(productoSeleccionado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un producto y asegúrese de estar registrado.");
                }
            }
        });

        btnRealizarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para realizar pedido
                if (currentClient != null) {
                    String resultado = container.completeOrder(currentClient);
                    JOptionPane.showMessageDialog(null, resultado);
                    clearCarrito();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe estar registrado para realizar un pedido.");
                }
            }
        });

        btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para pagar
                if (currentClient != null) {
                    String resultado = container.processPayment(currentClient);
                    JOptionPane.showMessageDialog(null, resultado);
                    clearCarrito();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe estar registrado para realizar el pago.");
                }
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para buscar producto
                String query = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
                List<Product> productos = container.searchProducts(query);
                if (productos != null && !productos.isEmpty()) {
                    setProductos(productos.stream().map(Product::getNombre).toArray(String[]::new));
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron productos.");
                }
            }
        });

        btnMostrarProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para mostrar todos los productos
                List<Product> productos = productService.listarProductos();
                if (productos != null && !productos.isEmpty()) {
                    displayProducts(productos);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron productos.");
                }
            }
        });
    }

    // Métodos para acceder a los campos
    public String getSelectedProduct() {
        return (String) cbProductos.getSelectedItem();
    }

    public void setProductos(String[] productos) {
        cbProductos.removeAllItems();
        for (String producto : productos) {
            cbProductos.addItem(producto);
        }
    }

    public void appendCarrito(String item) {
        taCarrito.append(item + "\n");
    }

    public void clearCarrito() {
        taCarrito.setText("");
    }

    private void displayProducts(List<Product> products) {
        taProductos.setText(""); // Limpiar el área de texto
        for (Product product : products) {
            taProductos.append("ID: " + product.getId() + " | Nombre: " + product.getNombre() + " | Precio: " + product.getPrecio() + " | Estado: " + product.getEstado() + "\n");
        }

        // Mostrar el panel de productos
        JFrame productosFrame = new JFrame("Productos en la Base de Datos");
        productosFrame.setSize(600, 400);
        productosFrame.setLocationRelativeTo(null);
        productosFrame.add(panelProductos);
        productosFrame.setVisible(true);
    }

    // Método para establecer el cliente actual
    public void setCurrentClient(Client client) {
        this.currentClient = client;
    }
}
