package ec.edu.uce.GrupalPersistencia.Entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductFinal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    @OneToMany(mappedBy = "productFinal")
    private List<Product> products;



    public ProductFinal() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
