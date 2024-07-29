package ec.edu.uce.GrupalLogica.Repositories;


import ec.edu.uce.GrupalLogica.model.entidades.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    boolean existsByEmail(String email);
    Admin findByEmail(String email);

}
