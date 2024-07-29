package ec.edu.uce.GrupalLogica.model.entidades;

import ec.edu.uce.GrupalLogica.model.interfaces.IClient;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client implements IClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;


    @OneToMany(mappedBy = "cliente")
    private List<Carrito> pedidos;

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

    public List<Carrito> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Carrito> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void comprar() {

    }

    @Override
    public void pagar() {

    }

    @Override
    public void reclamar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void solicitar() {

    }

    @Override
    public void notificar() {

    }

    @Override
    public void validar() {

    }

    @Override
    public void registrar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void login() {

    }
}
