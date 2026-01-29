package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Pintura pintura = new Pintura(250);


        Forma rectangulo = new Rectangulo("Rectángulo", 20, 35);
        Forma esfera = new Esfera("Polimorfismo.Esfera", 15);
        Forma cilindro = new Cilindro("Polimorfismo.Cilindro", 10, 30);

        System.out.println(rectangulo + ": " + pintura.cantidadPintura(rectangulo));
        System.out.println(esfera + ": " + pintura.cantidadPintura(esfera));
        System.out.println(cilindro + ": " + pintura.cantidadPintura(cilindro));

    }
}
