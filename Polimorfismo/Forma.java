package Polimorfismo;

public abstract class Forma {
    protected String nombre;

    Forma(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }

    public abstract double area();
}
