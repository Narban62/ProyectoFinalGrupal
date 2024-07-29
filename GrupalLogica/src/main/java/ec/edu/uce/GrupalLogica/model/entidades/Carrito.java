package ec.edu.uce.GrupalLogica.model.entidades;

import ec.edu.uce.GrupalLogica.model.interfaces.ICarrito;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Carrito implements ICarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;


    @ManyToMany
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client cliente;

    public Carrito() {
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

    @Override
    public void comprar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void modificar() {

    }

    @Override
    public void registrar() {
        //Aqui se debe relacionar con el quiente y sus productos
    }
}

