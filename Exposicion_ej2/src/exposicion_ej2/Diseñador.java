
package exposicion_ej2;


public class Diseñador extends Empleado {
    public int logo;
    public int valor;
    public int folleto;
    public Diseñador(int valor,int logo,int folleto){
        this.logo=logo;
        this.valor=valor;
        this.folleto=folleto;
    }
    @Override
    public int salario(){
        int salarioDiseñador= (logo*valor)+(folleto*(2*valor));
        return salarioDiseñador;
    }   
}
