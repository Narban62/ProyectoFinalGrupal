package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductoService {
    private final RestTemplate restTemplate;

    public ProductoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Product> getProductos() {
        return List.of(restTemplate.getForObject("http://localhost:8080/productos", Product[].class));
    }
}