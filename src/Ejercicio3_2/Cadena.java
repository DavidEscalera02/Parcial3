package Ejercicio3_2;

public class Cadena {
    String TextoInicial = " Programación Orientada a Objetos ";
    int contarMayusculas(String D) {
        int count = 0;
        for (int i = 0; i < D.length(); i++) {
            if (Character.isUpperCase(D.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    int contarLetra(String A, char letra) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == letra || A.charAt(i) == Character.toLowerCase(letra)) {
                count++;
            }
        }
        return count;
    }

    String eliminarEspacios(String V) {
        return V.replaceAll(" ", "");
    }

    String invertirString(String I) {
        String rever = "";
        for (int i = I.length() - 1; i >= 0; i--) {
            rever += I.charAt(i);
        }
        return rever;
    }
}
