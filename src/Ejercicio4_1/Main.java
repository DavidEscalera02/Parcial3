package Ejercicio4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial= $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés=" );
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        System.out.println("---------------------------");
        Libro texto = new Libro("ingles","Elisa Perez",500);
        texto.leer();
        System.out.println("---------------------------");
        ExtenderLibro texto1=new ExtenderLibro("Rosita","Julian Alanis",500,"Primaria");
        texto1.leer();
        System.out.println("----------------------------------");
        Novela novela = new Novela("La Rosa de Guadalupe","Carlos Eduardo Mercado Orduña",500,Novela.tipo.ROMANTICA);
        novela.leer();
    }
}
