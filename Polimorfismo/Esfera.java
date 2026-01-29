package Polimorfismo;

public class Esfera extends Forma {
    private int radio;

    Esfera(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

}
