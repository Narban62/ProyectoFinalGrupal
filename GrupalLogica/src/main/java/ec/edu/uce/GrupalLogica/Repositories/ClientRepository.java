package ec.edu.uce.GrupalLogica.Repositories;

import ec.edu.uce.GrupalLogica.model.entidades.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    boolean existsByEmail(String email);
    Client findByEmail(String email);

}
