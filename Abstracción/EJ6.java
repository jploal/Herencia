package Abstracción;

import java.util.Arrays;

public class EJ6 {
    abstract static class Forma{
        private int numLados;

        public int getNumLados() {
            return numLados;
        }

        public Forma(int numLados){
            this.numLados = numLados;
        };

        abstract public double getArea();
        abstract public double getPerimeter();
    }
    public class Triangulo extends Forma{
        private double base;
        private double altura;
        public Triangulo(int numLados,double base, double altura){
            super(numLados);
            this.base = base;
            this.altura = altura;
        }
        public double getArea(){
        return (this.base*this.altura)/2;
        }
        public double getPerimeter(){
            //Suponemos angulo recto para hacer hipotenusa
            double h;
            h = Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base,2));
            return h+this.base+this.altura;
            //podemos suponer equilatero sería base*3 pero para usar altura haremos esto
        }
    }
    public static class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{
        private double ancho;
        private double altura;
        public Rectangulo(int numLados,double base, double altura){
            super(numLados);
            this.ancho = base;
            this.altura = altura;
        }
        public double getArea(){
        return (this.ancho*this.altura);
        }
        public double getPerimeter(){
        return (this.altura+this.ancho)*2;
        }
        @Override
        public void redimensionar(int factor) {
            this.ancho *= factor;
            this.altura *= factor;
        }
        @Override
        public int compareTo(Rectangulo r2) {
            return Double.compare(this.getArea(), r2.getArea());
        }

    }
    public interface Redimensionable{
        void redimensionar(int x);
    }
    public static void main(String[] args) {
    Rectangulo a =new Rectangulo(4,2,3);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        a.redimensionar(2);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        Rectangulo b =new Rectangulo(4,3,5);
        System.out.println(a.compareTo(b));

        Rectangulo[] rectangulos = new Rectangulo[10];

        rectangulos[0] = new Rectangulo(4, 2, 5);
        rectangulos[1] = new Rectangulo(4, 3, 7);
        rectangulos[2] = new Rectangulo(4, 4, 4);
        rectangulos[3] = new Rectangulo(4, 6, 2);
        rectangulos[4] = new Rectangulo(4, 5, 5);
        rectangulos[5] = new Rectangulo(4, 10, 2);
        rectangulos[6] = new Rectangulo(4, 8, 3);
        rectangulos[7] = new Rectangulo(4, 9, 4);
        rectangulos[8] = new Rectangulo(4, 7, 6);
        rectangulos[9] = new Rectangulo(4, 12, 1);

        Arrays.sort(rectangulos);

        for (Rectangulo rectangulo : rectangulos) {
            System.out.println(rectangulo);
        }
    }
}