package ec.edu.uce.GrupalPersistencia.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
public class CustomOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    @ManyToMany
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
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

