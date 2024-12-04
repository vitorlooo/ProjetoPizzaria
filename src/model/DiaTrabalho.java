package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DiaTrabalho {
    private int id;
    private LocalDate data;
    private List<Pedido> pedidos = new ArrayList<>();

    public DiaTrabalho(LocalDate data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    @Override
    public String toString() {
        return "Dia de Trabalho {" +
               "id=" + id +
               ", data=" + data +
               ", pedidos=" + pedidos +
               '}';
    }
}
    



