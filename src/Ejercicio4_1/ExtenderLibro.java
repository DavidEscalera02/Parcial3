package Ejercicio4_1;

public class ExtenderLibro extends Libro {
    private String curso;

    public ExtenderLibro(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void leer(){
        super.leer();
        System.out.println("Curso: "+curso);
    }

}
