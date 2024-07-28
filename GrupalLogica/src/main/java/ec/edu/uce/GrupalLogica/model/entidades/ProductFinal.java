package ec.edu.uce.GrupalLogica.model.entidades;


import jakarta.persistence.*;

import java.util.List;


public class ProductFinal {

    private Long id;
    private String tipo;

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
