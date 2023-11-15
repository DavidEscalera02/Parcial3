package Ejercicio4_1;

public class Novela extends Libro{
    private String tipo;

    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void leer(){
        super.leer();
        System.out.println("Tipo: "+tipo);
    }
}
