package ec.edu.uce.GrupalLogica.Repositories;


import ec.edu.uce.GrupalLogica.model.entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT t FROM User t WHERE t.email = ?1")
    Optional<User> findByEmail(String email);

}
