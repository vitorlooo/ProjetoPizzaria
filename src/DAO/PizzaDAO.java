package dao;

import model.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PizzaDAO {
    private List<Pizza> pizzas = new ArrayList<>();
    private int currentId = 1;

    public Pizza create(Pizza pizza) {
        pizza.setId(currentId++);
        pizzas.add(pizza);
        return pizza;
    }

    public List<Pizza> findAll() {
        return new ArrayList<>(pizzas);
    }

    public Optional<Pizza> findById(int id) {
        return pizzas.stream().filter(p -> p.getId() == id).findFirst();
    }

    public Pizza update(int id, Pizza updatedPizza) {
        Optional<Pizza> pizzaOptional = findById(id);
        if (pizzaOptional.isPresent()) {
            Pizza pizza = pizzaOptional.get();
            pizza.setTipo(updatedPizza.getTipo());
            pizza.setPreco(updatedPizza.getPreco());
            return pizza;
        }
        return null;
    }

    public boolean delete(int id) {
        return pizzas.removeIf(p -> p.getId() == id);
    }
}
