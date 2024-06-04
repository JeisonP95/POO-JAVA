
package com.sanchezdarcypencuejesus.exposicion_ej3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exposicion_ej3 {

    public static void main(String[] args) {
        List<ReservaHostal> reservaalojamiento = new ArrayList<>();
        Scanner scanner =new Scanner (System.in);
        System.out.println("Ingrese el numero de dias que desea alojar");
        int dias=scanner.nextInt();
        
        ReservaHostal reserva= new ReservaHostal(dias,80000,3000);
        reservaalojamiento.add(reserva);
        System.out.println("costo total hostal: "+reserva.calcularCosto());
        
        System.out.println();
        ReservaHotel reservahotel=new ReservaHotel(4,40000);
        System.out.println("Costo total noches en hotel: "+reservahotel.calcularCosto());
        ReservaAirbnb reservaairbnb=new ReservaAirbnb(3,40000,12000);
        System.out.println("Costo total noches Airbnb: "+reservaairbnb.calcularCosto());
    }
    
}
