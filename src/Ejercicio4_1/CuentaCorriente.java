package Ejercicio4_1;

public class CuentaCorriente extends Cuenta{
    float sobregiro;
    public CuentaCorriente(float saldo,float tasa){
        super(saldo,tasa);
        sobregiro=0;
    }
    public void retirar(float cantidad) {
        float resultado=saldo-cantidad;
        if (resultado<0){
            sobregiro=sobregiro-resultado;
            saldo=0;
        }else {
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad) {
        float residu=sobregiro-cantidad;
        if (residu<0){
            sobregiro=0;
            saldo=residu;
        }else {
            super.consignar(cantidad);
        }
    }

    public void extractoMensual() {
        super.extractoMensual();
    }
    public void imprimir(){
        System.out.println("Saldo=$"+saldo);
        System.out.println("Cargo Mensual=$"+comisionMensual);
        System.out.println("Numero de transaciones="+(numeroCosignaciones+numeroRetiros));
        System.out.println("Valor de sobregiro=$"+(numeroCosignaciones+numeroRetiros));
        System.out.println();
    }

}
