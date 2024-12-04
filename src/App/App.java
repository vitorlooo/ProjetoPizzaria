package app;

import dao.PedidoDAO;
import dao.PizzaDAO;
import dao.DiaTrabalhoDAO;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        PizzaDAO pizzaDAO = new PizzaDAO();
        DiaTrabalhoDAO diaDeTrabalhoDAO = new DiaTrabalhoDAO();  
        PedidoDAO pedidoDAO = new PedidoDAO();

        Pizza pizza1 = pizzaDAO.create(new PizzaCalabresa());  
        Pizza pizza2 = pizzaDAO.create(new PizzaMargarita());
        Pizza pizza3 = pizzaDAO.create(new PizzaQuatroQueijos());  

        displayPizzas(pizzaDAO);

        pizza1.setTipo("Pizza Calabresa Atualizada");
        pizza1.setPreco(30.0); 
        pizzaDAO.update(1, pizza1);
        System.out.println("Pizza Atualizada:");
        System.out.println(pizzaDAO.findById(1).orElse(null));

        Pedido pedido = pedidoDAO.create(1, LocalDateTime.now(), Arrays.asList(pizza1, pizza2, pizza3));

        DiaTrabalho diaDeTrabalho = diaDeTrabalhoDAO.create(LocalDate.now());
        diaDeTrabalhoDAO.addPedido(diaDeTrabalho.getId(), pedido);

        displayPedidos(pedidoDAO);
        displayDiasDeTrabalho(diaDeTrabalhoDAO);
    }

    private static void displayPizzas(PizzaDAO pizzaDAO) {
        List<Pizza> pizzas = pizzaDAO.findAll();
        System.out.println("Todas as pizzas:");
        pizzas.forEach(pizza -> System.out.println(pizza));
    }

    private static void displayPedidos(PedidoDAO pedidoDAO) {
        System.out.println("Pedidos:");
        pedidoDAO.findAll().forEach(System.out::println);
    }

    private static void displayDiasDeTrabalho(DiaTrabalhoDAO diaDeTrabalhoDAO) {
        System.out.println("Dias de Trabalho:");
        diaDeTrabalhoDAO.findAll().forEach(System.out::println);
    }
}
