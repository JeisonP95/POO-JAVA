
package exposicion_ej2;


public class Exposicion_ej2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente gerente1 =new Gerente(120,100);
        Desarrollador desarrollador1 =new Desarrollador(2,350);
        Diseñador diseñador1 =new Diseñador(40,5,2);
        System.out.println("El salario del egrente es: "+gerente1.salario());
        System.out.println("El salario del desarrollador: "+desarrollador1.salario());
        System.out.println("El salario del diseñador :" + diseñador1.salario());
    }
}
