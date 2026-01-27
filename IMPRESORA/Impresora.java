package IMPRESORA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Impresora {

    private int toner;
    private int nPaginas;
    private boolean doblecara;

    public int getToner() {
        return toner;
    }

    public int getnPaginas() {
        return nPaginas;
    }
    Impresora(int toner, boolean doblecara){
        this.toner = toner;
        this.doblecara = doblecara;
        this.nPaginas = 0;
    }
    Impresora(int toner, int nPaginas, boolean doblecara) {
        if (toner > 100) {
            throw new InputMismatchException("El toner no puede superar el 100%");
        }if (toner < 0) {
            throw new InputMismatchException("El toner no puede ser inferior al 0%");
        }
        this.toner = toner;
        this.nPaginas = nPaginas;
        this.doblecara = doblecara;
    }

    public int rellenar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuánto toner quieres rellenar?");
        int r = sc.nextInt();
        if (r < 0) {
            return -1;
        }
        if (this.toner + r > 100) {
            return -1;
        }
        return this.toner += r;
    }

    public void cuentaPaginas(int c) {
        if (c < 0) {
            return;
        }
        if (!this.doblecara) {
            this.nPaginas += c;
        } else {
            if (c % 2 == 0) {
                this.nPaginas += (c / 2);
            } else {
                this.nPaginas += ((c + 1)/2);
            }
        }
    }
    public int imprimir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas páginas quieres imprimir?");
        int i= sc.nextInt();
        if (i < 0) {
            return -1;
        }
        if (i>this.toner){
            return -1;
        }
        this.toner-=i;
        this.cuentaPaginas(i);
        return i;
    }
    public static Impresora menuCreacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de toner (entre 0 y 100):");
        int tonerInicial = sc.nextInt();
        sc.nextLine();

        boolean segundaMano = false;
        boolean valido = false;
        String respuesta;
        do {
            System.out.println("Es tu impresora de segunda mano? Y/N");
            respuesta = sc.nextLine();
            try {
                segundaMano = Auxiliares.interpretarYN(respuesta);
                valido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada inválida. Debes escribir Y o N.");
            }
        } while (!valido);


        valido = false;
        boolean dobleCara = false;
        do {
            System.out.println("Es tu impresora de doble cara? Y/N");
            respuesta = sc.nextLine();
            try {
                dobleCara = Auxiliares.interpretarYN(respuesta);
                valido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada inválida. Debes escribir Y o N.");
            }
        } while (!valido);

        Impresora impresora;

        if (segundaMano) {
            int paginasImpresas = -1;
            while (paginasImpresas < 0) {
                System.out.println("¿Cuántas páginas ha impreso hasta ahora?");
                paginasImpresas = sc.nextInt();
                sc.nextLine(); // limpiar buffer
                if (paginasImpresas < 0) {
                    System.out.println("El número de páginas no puede ser negativo.");
                }
            }

            impresora = new Impresora(tonerInicial, paginasImpresas, dobleCara);
        } else {

            impresora= new Impresora(tonerInicial, dobleCara);
        }
        System.out.println("IMPRESORA.Impresora creada: toner " + tonerInicial + "%, páginas "
                + impresora.getnPaginas() + ", doble cara: " + (dobleCara ? "Sí" : "No"));
        return impresora;
    }
}
