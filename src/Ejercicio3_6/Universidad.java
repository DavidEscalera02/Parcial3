package Ejercicio3_6;

import java.util.ArrayList;
import java.util.Scanner;

/*public class Universidad {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public void agregarEstudiante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del estudiante: ");
        String codigoEstudiante = scanner.nextLine();

        if (existeEstudiante(codigoEstudiante)) {
            System.out.println("El código del estudiante ya existe.");
            return;
        }

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        System.out.println("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble();

        Estudiante estudiante = new Estudiante(codigoEstudiante, nombreEstudiante, nota);
        estudiantes.add(estudiante);

        System.out.println("El estudiante ha sido agregado correctamente.");
    }

    public boolean existeEstudiante(String codigoEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            //*if (estudiante.getCodigo().equals(codigoEstudiante)) {
                return true;
            }
        }
        return false;
    }

    public void buscarEstudiante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del estudiante a buscar: ");
        String codigoEstudiante = scanner.nextLine();

        Estudiante estudiante = buscarEstudiante(codigoEstudiante);

        if (estudiante == null) {
            System.out.println("El estudiante no existe.");
            return;
        }

        System.out.println("Datos del estudiante:");
        System.out.println("Código: " + estudiante.getCodigo());
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Nota: " + estudiante.getnota());
    }

    public Estudiante buscarEstudiante(String codigoEstudiante) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigoEstudiante)){
                return estudiante;
            }
        }
        return null;
    }

    public void eliminarEstudiante() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del estudiante a eliminar: ");
        String codigoEstudiante = scanner.nextLine();

        Estudiante estudiante = buscarEstudiante(codigoEstudiante);

        if (estudiante == null) {
            System.out.println("El estudiante no existe.");
            return;
        }

        System.out.println("¿Está seguro de eliminar al estudiante? (S/N)");
        String respuesta = scanner.nextLine();

        if (respuesta.equals("S")) {
            estudiantes.remove(estudiante);
            System.out.println("El estudiante ha sido eliminado correctamente.");
        }
    }

    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getnota();
        }
        return sumaNotas / estudiantes.size();
    }

    public int obtenerCantidadAprobados() {
        int cantidadAprobados = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getnota() >= 3.0) {
                cantidadAprobados++;
            }
        }
        return cantidadAprobados;
    }

    public double obtenerPorcentajeAprobados() {
        return (double) obtenerCantidadAprobados() / estudiantes.size() * 100;
    }

}


*/
