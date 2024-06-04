
package exposicion_ej1;


public class Carro extends Vehiculo{
    public String marca;
    
    public Carro (String marca){
        this.marca=marca;
    }
    @Override
    public String numruedas(){
        return "El carro tiene 4 ruedas " +" su marca es:  "+ marca;   
    }
    @Override
    public String acelerar(){
        return "el carro esta acelerando";
    }
    
}
