package model;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa() {
        super.setTipo("Calabresa");
        super.setPreco(25.0);  
    }

    @Override
    public String toString() {
        return "Pizza Calabresa - Preco: " + super.getPreco();
    }
}
