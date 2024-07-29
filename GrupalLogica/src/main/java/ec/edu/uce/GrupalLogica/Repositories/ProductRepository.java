package ec.edu.uce.GrupalLogica.Repositories;


import ec.edu.uce.GrupalLogica.model.entidades.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
