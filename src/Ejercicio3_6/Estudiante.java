package Ejercicio3_6;

public class Estudiante {
    String nombre;
    String apellido;
    int codigo;
    int numeroSemestre;
    double nota;

    public Estudiante(String nombre, String apellido, int codigo, int numeroSemestre, float nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.numeroSemestre = numeroSemestre;
        this.nota = nota;
    }

    public Estudiante(String codigoEstudiante, String nombreEstudiante, double nota) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public double getnota() {
        return nota;
    }

    public void setNotaFinal(double nota) {
        this.nota = nota;
    }
}
