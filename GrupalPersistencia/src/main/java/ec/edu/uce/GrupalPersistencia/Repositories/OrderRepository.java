package ec.edu.uce.GrupalPersistencia.Repositories;


import ec.edu.uce.GrupalPersistencia.Entities.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomOrder, Long> {
}
