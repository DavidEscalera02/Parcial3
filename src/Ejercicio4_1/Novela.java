package Ejercicio4_1;

public class Novela extends Libro{
    enum tipo{ROMANTICA,TERROR,FANTASTICAS,REALISTAS}
    tipo tiponovela;

    public Novela(String titulo, String autor, double precio, tipo tiponovela) {
        super(titulo, autor, precio);
        this.tiponovela = tiponovela;
    }

    public void leer(){
        super.leer();
        System.out.println("Tipo: "+tiponovela);
    }
}
