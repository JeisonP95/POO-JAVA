
package com.sanchezdarcypencuejesus.exposicion_ej3;


public class ReservaHotel extends ReservaAlojamiento{
    private int noches;
    private double precioPorNoche;

    public ReservaHotel(int noches, double precioPorNoche) {
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
    }
    
    @Override
    public double calcularCosto(){
        double variablea=(double)(noches*precioPorNoche);
        return variablea;
        
       
    }
    
    
}
