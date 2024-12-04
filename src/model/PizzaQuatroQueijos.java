package model;

public class PizzaQuatroQueijos extends Pizza {

    public PizzaQuatroQueijos() {
        super.setTipo("Quatro Queijos");
        super.setPreco(28.0);  
    }

    @Override
    public String toString() {
        return "Pizza Quatro Queijos - Preco: " + super.getPreco();
    }
}
