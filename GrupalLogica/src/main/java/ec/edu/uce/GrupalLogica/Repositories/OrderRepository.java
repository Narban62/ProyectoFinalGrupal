package ec.edu.uce.GrupalLogica.Repositories;


import ec.edu.uce.GrupalLogica.model.entidades.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Carrito, Long> {
}
