package ec.edu.uce.GrupalLogica.Services;


import ec.edu.uce.GrupalLogica.model.entidades.EtapaFabricacion;
import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class FabricacionService {
    private final ExecutorService executor = Executors.newFixedThreadPool(10);
    private final ProductService productService;

    @Autowired
    public FabricacionService(ProductService productService) {
        this.productService = productService;
    }

    public void iniciarFabricacion(Product producto) {
        executor.submit(() -> {
            for (EtapaFabricacion etapa : EtapaFabricacion.values()) {
                try {
                    // Simular tiempo de cada etapa
                    Thread.sleep(5000); // 5 segundos por etapa, por ejemplo
                    productService.actualizarEstadoProducto(producto.getId(), etapa.name());
                    System.out.println("Producto " + producto.getNombre() + " en etapa: " + etapa);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }
}