package ec.edu.uce.GrupalLogica.model.entidades;

import java.time.LocalDate;
import java.util.List;


public class CustomOrder {


    private Long id;
    private LocalDate fecha;
    private List<Product> products;

    private Client cliente;

    public CustomOrder() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
}

