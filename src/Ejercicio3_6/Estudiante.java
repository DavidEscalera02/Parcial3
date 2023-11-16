package Ejercicio3_6;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private String codigo;
    private int semestre;
    private double nota;

    public Estudiante(String nombre, String apellidos, String codigo, int semestre, double nota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.semestre = semestre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
