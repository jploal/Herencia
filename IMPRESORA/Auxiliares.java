package IMPRESORA;

public class Auxiliares {
        public static boolean interpretarYN(String respuesta) {
            respuesta = respuesta.trim().toUpperCase();
            if (respuesta.equals("Y")) {
                return true;
            } else if (respuesta.equals("N")) {
                return false;
            } else {
                throw new IllegalArgumentException("Respuesta inválida");
            }
        }
}
