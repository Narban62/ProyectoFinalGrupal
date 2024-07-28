package ec.edu.uce.GrupalPersistencia.Repositories;


import ec.edu.uce.GrupalPersistencia.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
