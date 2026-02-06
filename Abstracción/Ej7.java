package Abstracción;

import java.util.Arrays;

public class Ej7 {
    public static class Estudiante implements Comparable<Estudiante>{
        String nombre;
        int edad;
        double altura;
        Estudiante(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }
        @Override
        public int compareTo(Estudiante e) {
            if (this.altura != e.altura) {
                return Double.compare(e.altura, this.altura);
            }
            return Integer.compare(e.edad, this.edad);
        }

        @Override
        public String toString() {
            return nombre + " - Altura: " + altura + " - Edad: " + edad;
        }
    }

    public static void main(String[] args) {
        Estudiante lista[] =new Estudiante[5];
        lista[0] = new Estudiante("Patri", 12, 170);
        lista[1] = new Estudiante("Manuel", 43, 173);
        lista[2] = new Estudiante("Javier", 72, 189);
        lista[3] = new Estudiante("Alicia", 52, 168);
        lista[4] = new Estudiante("Alberto", 35, 189);
        Arrays.sort(lista);
        for (int i=0; i < lista.length;i++){
            System.out.print(i+1+". ");
            System.out.println(lista[i]);
        }

    }
}
