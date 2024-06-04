
package com.sanchezdarcypencuejesus.exposicion_ej3;

public class ReservaHostal extends ReservaAlojamiento  {
    private int noches;
    private double precioPorNoche;
    private double desayunoIncluido;
    
    public ReservaHostal(int noches,double precioPorNoche,double desayunoIncluido){
        this.noches=noches;
        this.precioPorNoche=precioPorNoche;
        this.desayunoIncluido=desayunoIncluido;            
    }
    @Override
    public double calcularCosto(){
        double a = (double)(noches*precioPorNoche)+(noches*desayunoIncluido);
        return a;
        
        
    }
}
