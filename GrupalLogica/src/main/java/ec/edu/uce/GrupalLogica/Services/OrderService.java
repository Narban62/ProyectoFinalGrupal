package ec.edu.uce.GrupalLogica.Services;


import ec.edu.uce.GrupalLogica.Repositories.OrderRepository;
import ec.edu.uce.GrupalLogica.model.entidades.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Carrito> listOrders() {
        return orderRepository.findAll();
    }

    public Carrito saveOrders(Carrito carrito) {
        return orderRepository.save(carrito);
    }
}
