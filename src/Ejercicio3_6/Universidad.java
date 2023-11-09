package Ejercicio3_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidad {
    ArrayList<Estudiante>estudiantes;
    public Universidad(){
        estudiantes=new ArrayList<>();
    }
    public void Anadir(Estudiante estudiante){
        for (Estudiante e: estudiantes){
            if (e.codigo == estudiante.codigo){
                System.out.println("El codigo ya existe. ");
                return;
            }
        }
        estudiantes.add(estudiante);
        System.out.println("Estudiante correctamento añadido");
    }
    public void buscar(int codigo){
        for (Estudiante e: estudiantes){
            if (e.codigo == codigo){
                System.out.println("Estudiante encontrado");
                System.out.println("Nombre="+e.nombre+" "+e.apellido);
                System.out.println("Codigo="+e.codigo);
                System.out.println("Semestre="+e.numeroSemestre);
                System.out.println("Nota final="+e.notaFinal);
                return;

            }
        }
        System.out.println("Estudiante no encontrado");
    }
    public void eliminar(int codigo){
        for(Estudiante e : estudiantes) {
            if (e.codigo == codigo) {
                System.out.println("Nombre=" + e.nombre + " " + e.apellido);
                System.out.println("Codigo=" + e.codigo);
                System.out.println("Semestre=" + e.numeroSemestre);
                System.out.println("Nota final=" + e.notaFinal);
                Scanner sc = new Scanner(System.in);
                String res = sc.next();
                System.out.println("Ingresar el codigo del Estudiante");
                if (res.equalsIgnoreCase("s")) {
                    estudiantes.remove(e);
                    System.out.println("Eliminando al Estudiante.....");
                } else {
                    System.out.println("Estudiante no eliminando");
                }
                return;
            }
        }
    }
    public void CalcularPromedio(){
        float sumNota=0;
        for (Estudiante e : estudiantes) {
            sumNota+=e.notaFinal;

        }
        return estudiantes.size() > 0 ? sumNota /estudiantes.size():0 ;
    }
    public int contarEstudianteAprobados (){
        int contar =0;
        for (Estudiante e: estudiantes){
            if (e.notaFinal <= 3.0){
                contar++;
            }
        }
        return contar;

    }
    public int contaraPorcentajeAprobados(){
        int TotalEstudiante=estudiantes.size();
        if (TotalEstudiante > 0) {
            int aprobados=contarEstudianteAprobados();
            return (double)aprobados / TotalEstudiante * 100;
        }else {
            return 0;
        }

    }
}
