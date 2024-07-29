package ec.edu.uce.GrupalLogica.model.entidades;

import ec.edu.uce.GrupalLogica.model.interfaces.IAdmin;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Entity
@Service
public class Admin implements IAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;

//    private ServerConnection serverConnection;

    public Admin() {
//        this.serverConnection = new ServerConnection();
    }

    public Admin(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void aprobar() {
        // Lógica para aprobar el carrito
    }

    @Override
    public void rechazar() {
        // Lógica para rechazar
    }

    @Override
    public void asignar() {
        // Lógica para asignar
    }

    @Override
    public void notificar() {
        // Lógica para notificar
    }

    @Override
    public void revisar() {
        // Lógica para revisar
    }

    @Override
    public void solicitar() {
        // Lógica para solicitar
    }

    @Override
    public void validar() {
        // Lógica para validar
    }

    @Override
    public void registrar(String nombre, String apellido, String email, String password) {
        boolean isRegistered = true;
        if (isRegistered) {
            System.out.println("Admin registrado exitosamente: " + email);
        } else {
            System.out.println("Error al registrar el admin");
        }
    }

    @Override
    public void eliminar() {
        // Lógica para eliminar
    }

    @Override
    public void login(String email, String password) {
        // Lógica para manejar el login después de la autenticación exitosa
        System.out.println("Admin logged in with email: " + email);
    }



}
