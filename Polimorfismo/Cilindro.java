package Polimorfismo;

public class Cilindro extends Forma {
    private int radio;
    private int altura;

    Cilindro(String nombre, int radio, int altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radio * (radio + altura);
    }
}
