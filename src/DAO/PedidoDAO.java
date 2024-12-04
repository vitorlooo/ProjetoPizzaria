package dao;

import model.Pedido;
import model.Pizza;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoDAO {
    private final List<Pedido> pedidos = new ArrayList<>();
    private int currentId = 1;

    public Pedido create(int clienteId, LocalDateTime data, List<Pizza> pizzas) {
        Pedido pedido = new Pedido(clienteId, data, pizzas);
        pedido.setId(currentId++);
        pedidos.add(pedido);
        return pedido;
    }

    public List<Pedido> findAll() {
        return new ArrayList<>(pedidos);
    }

    public Optional<Pedido> findById(int id) {
        return pedidos.stream().filter(p -> p.getId() == id).findFirst();
    }

    public Pedido update(int id, int clienteId, LocalDateTime data, List<Pizza> pizzas) {
        Optional<Pedido> pedidoOptional = findById(id);
        if (pedidoOptional.isPresent()) {
            Pedido pedido = pedidoOptional.get();
            pedido.setClienteId(clienteId);
            pedido.setData(data);
            pedido.setPizzas(pizzas);
            return pedido;
        }
        return null;
    }

    public boolean delete(int id) {
        return pedidos.removeIf(p -> p.getId() == id);
    }
}
