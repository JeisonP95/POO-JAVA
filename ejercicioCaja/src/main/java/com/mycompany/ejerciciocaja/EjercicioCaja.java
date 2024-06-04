package com.mycompany.ejerciciocaja;

public class EjercicioCaja {

    public static void main(String[] args) {
         
        Caja caja1 = new Caja();
        Caja caja2 = new Caja(1, 2, 3);
        Caja caja3 = new Caja(caja2);
        caja3.setLargo(10);//estamos diciendo que cambiamos el valor de largo de 1 a 10
        double largo=caja3.getLargo();
        
        System.out.println("El estado de la caja 1 "+caja1.estado());
        System.out.println("El estado de la caja 2 "+caja2.estado());
        System.out.println("El estado de la caja 3 "+caja3.estado());
        
        System.out.println("El volumen de la caja 1 es: "+caja1.calcularVolumen());
        System.out.println("El volumen de la caja 2 es: "+caja2.calcularVolumen());
        System.out.println("El volumen de la caja 3 es: "+caja3.calcularVolumen());
    
    }
}
