package ec.edu.uce.GrupalPersistencia.Controller;

import ec.edu.uce.GrupalPersistencia.Entities.CustomOrder;
import ec.edu.uce.GrupalPersistencia.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<CustomOrder> obtainAll() {
        return orderService.listOrders();
    }

    @PostMapping
    public CustomOrder crearPedido(@RequestBody CustomOrder customOrder) {
        return orderService.saveOrders(customOrder);
    }
}