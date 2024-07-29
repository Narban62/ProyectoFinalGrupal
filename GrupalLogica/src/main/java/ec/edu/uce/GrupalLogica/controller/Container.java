package ec.edu.uce.GrupalLogica.controller;

import ec.edu.uce.GrupalLogica.Services.AdminService;
import ec.edu.uce.GrupalLogica.Services.ClientService;
import ec.edu.uce.GrupalLogica.Services.OrderService;
import ec.edu.uce.GrupalLogica.Services.ProductService;
import ec.edu.uce.GrupalLogica.model.entidades.Admin;
import ec.edu.uce.GrupalLogica.model.entidades.Client;
import ec.edu.uce.GrupalLogica.model.entidades.Product;
import ec.edu.uce.GrupalLogica.model.interfaces.IAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
@Component
public class Container {

    @Autowired
    private AdminService adminService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    private IAdmin iAdmin;
    Client client = new Client();
    Admin admin = new Admin();

    public Container(IAdmin iAdmin) {
        this.iAdmin = iAdmin;
    }

    public String authenticateAdmin(String email, String password) {
        // Lógica para autenticar con el servidor
        Admin admin = adminService.findByEmail(email);
        if (admin != null && admin.getPassword().equals(password)) {
            return "Autenticación exitosa.";
        } else {
            return "Error: Credenciales incorrectas.";
        }

    }
    public String authenticateClient(String email, String password) {
        // Lógica para autenticar con el servidor
        client = clientService.findByEmail(email);
        if (client != null && client.getPassword().equals(password)) {
            return "Autenticación exitosa.";
        } else {
            return "Error: Credenciales incorrectas.";
        }

    }

    // Métodos Admin
    public String registerAdmin(String nombre, String apellido, String email, String password) {
        if (adminService.adminExist(email)) {
            return "Error: El administrador ya existe.";
        } else {
            Admin admin = new Admin(nombre, apellido, email, password);
            adminService.save(admin);
            return "Administrador registrado exitosamente.";
        }
    }

    // Métodos Cliente
    public String registerClient(String nombre, String apellido, String email, String password) {
        if (clientService.clientExist(email)) {
            return "Error: El cliente ya existe.";
        } else {
            Client client = new Client(nombre, apellido, email, password);
            clientService.guardarCliente(client);
            return "Cliente registrado exitosamente.";
        }
    }

    public List<Product> searchProducts(String query) {
        // Lógica para buscar productos por nombre o alguna otra propiedad
        return productService.searchProducts(query);
    }

    public String addToCart(Client client, Product product) {
        // Lógica para agregar un producto al carrito del cliente
        boolean success = orderService.addProductToCart(client, product);
        if (success) {
            return "Producto agregado al carrito exitosamente.";
        } else {
            return "Error al agregar el producto al carrito.";
        }
    }

    public String completeOrder(Client client) {
        // Lógica para completar el pedido del cliente
        boolean success = orderService.completeOrder(client);
        if (success) {
            return "Pedido realizado exitosamente.";
        } else {
            return "Error al realizar el pedido.";
        }
    }

    public String processPayment(Client client) {
        // Lógica para procesar el pago del cliente
        boolean success = orderService.processPayment(client);
        if (success) {
            return "Pago realizado exitosamente.";
        } else {
            return "Error al realizar el pago.";
        }
    }
    public String saveProduct(String nombre, double precio) {
        Product product = new Product(nombre, precio);
        productService.guardarProducto(product);
        return "Producto guardado exitosamente.";
    }
}
