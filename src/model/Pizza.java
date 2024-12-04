package model;

public abstract class Pizza {
    private int id;
    private String tipo;
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pizza{" +
               "id=" + id +
               ", tipo='" + tipo + '\'' +
               ", preco=" + preco +
               '}';
    }
}
