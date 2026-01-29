package Polimorfismo;

public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double getCobertura() {
        return cobertura;
    }
    public double cantidadPintura(Forma forma){
    return forma.area()/cobertura;
    }
}
