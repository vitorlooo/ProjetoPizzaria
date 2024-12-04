package model;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private int id;
    private int clienteId;
    private LocalDateTime data;
    private List<Pizza> pizzas;

    public Pedido(int clienteId, LocalDateTime data, List<Pizza> pizzas) {
        this.clienteId = clienteId;
        this.data = data;
        this.pizzas = pizzas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
    @Override
    public String toString() {
        return "Pedido{" +
               "id=" + id +
               ", clienteId=" + clienteId +
               ", data=" + data +
               ", pizzas=" + pizzas +
               '}';
    }
}
