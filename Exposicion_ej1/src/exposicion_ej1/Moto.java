
package exposicion_ej1;


public class Moto extends Vehiculo{
    public String tipo;
    
    public Moto(String tipo){
        this.tipo=tipo;
    }
    
    @Override
    public String numruedas(){
        return "La moto tiene 2 ruedas " + " es tipo " + tipo ;   
    }
    @Override
    public String acelerar(){
        return "La moto esta acelerando";
    }
}
