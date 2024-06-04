
package exposicion_ej1;


public abstract class Vehiculo {
    protected String marcaMotor;

    public Vehiculo(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }
    
    
    
    abstract String numruedas();
    
    abstract String acelerar();   
    
}
