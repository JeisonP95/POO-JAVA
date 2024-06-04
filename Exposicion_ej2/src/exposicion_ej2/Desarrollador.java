
package exposicion_ej2;

public class Desarrollador extends Empleado {
    public int proyecto;
    public int valorxproyecto;
    
    public Desarrollador (int proyecto,int valorxproyecto){
        this.proyecto=proyecto;
        this.valorxproyecto=valorxproyecto;
    }
    @Override
    public int salario(){
        int salariodesarrollador= proyecto*valorxproyecto;
        return salariodesarrollador; 
    }
}
