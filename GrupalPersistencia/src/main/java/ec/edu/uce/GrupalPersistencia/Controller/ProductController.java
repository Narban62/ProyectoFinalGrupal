package ec.edu.uce.GrupalPersistencia.Controller;


import ec.edu.uce.GrupalPersistencia.Entities.Product;
import ec.edu.uce.GrupalPersistencia.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> obtainAll() {
        return productService.listarProductos();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product producto) {
        return productService.guardarProducto(producto);
    }
}