package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.Repositories.ProductRepository;
import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listarProductos() {
        return productRepository.findAll();
    }

    public Product guardarProducto(Product product) {
        return productRepository.save(product);
    }

    public void actualizarEstadoProducto(Long productoId, String estado) {
        Product product = productRepository.findById(productoId).orElseThrow();
        product.setEstado(estado);
        productRepository.save(product);
    }

    public Product buscarProductoPorId(Long id) {
        return productRepository.findById(id).orElse(null);
    }


}
