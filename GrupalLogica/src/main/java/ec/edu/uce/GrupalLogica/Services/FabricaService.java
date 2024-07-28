package ec.edu.uce.GrupalLogica.Services;

import ec.edu.uce.GrupalLogica.controller.ProductObserver;
import ec.edu.uce.GrupalLogica.controller.ProductSubject;
import ec.edu.uce.GrupalLogica.model.entidades.Product;

import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class FabricaService {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private final ProductSubject productSubject = new ProductSubject();

    public void addObserver(ProductObserver observer) {
        productSubject.attach(observer);
    }

    public void removeObserver(ProductObserver observer) {
        productSubject.detach(observer);
    }

    public CompletableFuture<Void> fabricarProducto(Product producto) {
        return CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Iniciando fabricación de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de corte
                productSubject.notifyObservers("Corte completado de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de marcado
                productSubject.notifyObservers("Marcado completado de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de costura
                productSubject.notifyObservers("Costura completada de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de confección
                productSubject.notifyObservers("Confección completada de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de control de calidad
                productSubject.notifyObservers("Control de calidad completado de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de empaquetado
                productSubject.notifyObservers("Empaquetado completado de: " + producto.getNombre());
                Thread.sleep(2000); // Simula etapa de distribución
                productSubject.notifyObservers("Distribución completada de: " + producto.getNombre());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);
    }
}