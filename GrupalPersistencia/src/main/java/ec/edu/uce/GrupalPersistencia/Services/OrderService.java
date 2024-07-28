package ec.edu.uce.GrupalPersistencia.Services;


import ec.edu.uce.GrupalPersistencia.Entities.CustomOrder;
import ec.edu.uce.GrupalPersistencia.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<CustomOrder> listOrders() {
        return orderRepository.findAll();
    }

    public CustomOrder saveOrders(CustomOrder customOrder) {
        return orderRepository.save(customOrder);
    }
}
