package IMPRESORA;

public class MainEncapsulación {
    public static void main(String[] args) {
        Impresora I = Impresora.menuCreacion();
        System.out.println(I.imprimir() + " paginas impresas");
        System.out.println(I.getnPaginas() + " paginas se han imprimidod desde esta impresora");
        System.out.println(I.getToner() + "% de toner restante en la impresora");
        System.out.println(I.imprimir() + " paginas impresas");
        System.out.println(I.rellenar() + "% toner restante en la impresora" );
        }
    }
