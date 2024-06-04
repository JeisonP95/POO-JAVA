

package exposicion_ej1;


public class Bus extends Vehiculo {
    private int numAsientos;

    public Bus(int numAsientos, String marcaMotor) {
        super(marcaMotor);
        this.numAsientos = numAsientos;
    }
    
    
    
    @Override
    public String numruedas(){
        return "El bus tiene 6 ruedas ";   
    }
    @Override
    public String acelerar(){
        return "el bus esta acelerando";
    }
}
