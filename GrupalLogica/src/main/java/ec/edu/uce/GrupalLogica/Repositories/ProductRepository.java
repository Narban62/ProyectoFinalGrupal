package ec.edu.uce.GrupalLogica.Repositories;

import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String name);

    Product findByNameIgnoreCase(String name);

}
