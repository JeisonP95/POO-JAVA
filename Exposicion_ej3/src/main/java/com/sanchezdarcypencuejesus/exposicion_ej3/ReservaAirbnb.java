
package com.sanchezdarcypencuejesus.exposicion_ej3;


public class ReservaAirbnb extends ReservaAlojamiento {
    private int noches;
    private double tarifaNoche;
    private double tarifaLimpieza;
    
    public ReservaAirbnb(int noches,double tarifaNoche,double tarifaLimpieza){
        this.noches=noches;
        this.tarifaNoche=tarifaNoche;
        this.tarifaLimpieza=tarifaLimpieza;
    }
    @Override
    public double calcularCosto(){
        double variableb=(double)((noches*tarifaNoche)+tarifaLimpieza);
        return variableb;
    } 
    
}
