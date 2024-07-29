package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.Repositories.ProductRepository;
import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Listar todos los productos
    public List<Product> listarProductos() {
        List<Product> products = productRepository.findAll();
        System.out.println("Productos obtenidos: " + products);
        return products;
    }


    // Guardar un nuevo producto
    public Product guardarProducto(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        return productRepository.save(product);
    }

    // Actualizar el estado de un producto
    public void actualizarEstadoProducto(Long productoId, String estado) {
        if (productoId == null || estado == null || estado.isEmpty()) {
            throw new IllegalArgumentException("El ID del producto y el estado no pueden ser nulos o vacíos.");
        }

        Product product = productRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + productoId));
        product.setEstado(estado);
        productRepository.save(product);
    }

    // Buscar un producto por su ID
    public Product buscarProductoPorId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID del producto no puede ser nulo.");
        }
        return productRepository.findById(id).orElse(null);
    }

    // Buscar productos por una consulta (nombre u otra propiedad)
    public List<Product> searchProducts(String query) {
        if (query == null || query.isEmpty()) {
            throw new IllegalArgumentException("La consulta no puede ser nula o vacía.");
        }

        // Asegúrate de que el repositorio tenga este método
        return productRepository.findByNameContainingIgnoreCase(query);
    }


    // Buscar un producto por su nombre
    public Product searchProductByName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede ser nulo o vacío.");
        }

        // Buscar un producto por su nombre exacto
        return productRepository.findByNameIgnoreCase(name);
    }
}
