package model;

public class PizzaMargarita extends Pizza {

    public PizzaMargarita() {
        super.setTipo("Margarita");
        super.setPreco(22.0);  
    }

    @Override
    public String toString() {
        return "Pizza Margarita - Preco: " + super.getPreco();
    }
}
