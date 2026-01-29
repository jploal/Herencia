package Polimorfismo;

public class Rectangulo extends Forma {
    private int longitud;
    private int ancho;

    public Rectangulo(String nombre, int longitud, int ancho) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return (this.ancho * this.longitud);
    }

    public int getLongitud() {
        return longitud;
    }

    public int getAncho() {
        return ancho;
    }


    @Override
    public String toString() {
        return this.nombre;
    }
}
