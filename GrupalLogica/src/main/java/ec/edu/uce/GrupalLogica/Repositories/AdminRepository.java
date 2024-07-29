package ec.edu.uce.GrupalLogica.Repositories;

import ec.edu.uce.GrupalLogica.model.entidades.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Método para encontrar un Admin por su email
    Optional<Admin> findByEmail(String email);
}
