
package exposicion_ej2;


public class Gerente extends Empleado {
    public int valorxhora;
    public int hora;
    public Gerente (int valorxhora,int hora){
        this.valorxhora=valorxhora;
        this.hora=hora;
    }
    @Override
    public int salario(){
        int salario_gerente= valorxhora*hora;
        return salario_gerente;
    }
    
}
