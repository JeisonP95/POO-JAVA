/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author VivoBook
 */
public class caja {

    private double largo;
    private double ancho;
    private double alto;

    public caja() {
        this.largo = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    public caja(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    } 
    public String estado(){
        String estado="El largo es"+this.largo+" el ancho es"+this.ancho+""+" el alto es"+this.alto;
                return estado;
    }
    
    public double calcularVolumen(){
        return this.alto * this.ancho * this.largo;   
    }
    
//  constructor por defecto
    public caja(caja Caja){
        this.alto = Caja.alto;
    }
    public double getLargo(){
        return this.largo;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
}
