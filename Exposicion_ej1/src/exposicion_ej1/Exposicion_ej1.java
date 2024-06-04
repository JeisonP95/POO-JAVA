
package exposicion_ej1;
import java.util.ArrayList;
import java.util.List;


public class Exposicion_ej1 {


    public static void main(String[] args) {
        // TODO code application logic here
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Carro("Toyota"));
        vehiculos.add(new Moto("naked"));
        vehiculos.add(new Bus(15,"2jz"));
        
        for( Vehiculo vehiculo: vehiculos){
            vehiculo.numruedas();
            System.out.println(vehiculo.numruedas());
            vehiculo.acelerar();
            System.out.println(vehiculo.acelerar());
        }
        
    }  
}
