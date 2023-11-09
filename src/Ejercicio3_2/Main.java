package Ejercicio3_2;

public class Main {
    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        int tamano = cadena.TextoInicial.length();
        System.out.println("El tamaño del String es =" + tamano);
        String cadenaSinEspacios = cadena.TextoInicial.trim();
        System.out.println("El String sin espacios en blanco = " + cadenaSinEspacios);
        String cadenaMayuscula = cadenaSinEspacios.toUpperCase();
        System.out.println("El String en mayúscula = " + cadenaMayuscula);
        String cadenaConcateada = cadenaMayuscula.concat("12345");
        System.out.println("El String concatenado =" + cadenaConcateada);
        String cadenaExtraida = cadenaConcateada.substring(24, 31);
        System.out.println("El String extraído = " + cadenaExtraida);
        String cadenaReemplazada = cadenaExtraida.replace("O", "X");
        System.out.println("El String reemplazado = " + cadenaReemplazada);
        boolean comparacion = cadenaReemplazada.equals("Programacion");
        System.out.println("Los String son iguales = " + comparacion);
        System.out.println("-------------------------------");
        System.out.println("las mayusculas son= "+cadena.contarMayusculas(cadena.TextoInicial));
        System.out.println("las letras repetidas son= "+cadena.contarLetra(cadena.TextoInicial,'A'));
        System.out.println("Texto sin Espacios= "+cadena.eliminarEspacios(cadena.TextoInicial));
        System.out.println("Texto al reves= "+cadena.invertirString(cadena.TextoInicial));
    }
}
