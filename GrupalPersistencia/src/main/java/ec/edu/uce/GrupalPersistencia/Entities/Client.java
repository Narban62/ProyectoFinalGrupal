package ec.edu.uce.GrupalPersistencia.Entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<CustomOrder> pedidos;

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CustomOrder> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<CustomOrder> pedidos) {
        this.pedidos = pedidos;
    }
}
