
package com.mycompany.ejercicio02;


public class Ejercicio02 {

    public static void main(String[] args) {
        // Crear tres objetos utilizando diferentes constructores
        Estudiante estudiante1 = new Estudiante(1, 1, 3.8, "Valeria", 18);
        Estudiante estudiante2 = new Estudiante(4.3,3.3,2,"Yeison", 28);
        Estudiante estudiante3 = new Estudiante();

        // Mostrar el estado de cada objeto
        System.out.println("Estado de estudiante1:");
        System.out.println(estudiante1.obtenerEstado());
        System.out.println("Nota Final: " + estudiante1.calcularNotaFinal());
        System.out.println("\nEstado de estudiante2:");
        System.out.println(estudiante2.obtenerEstado());
        System.out.println("Nota Final: " + estudiante2.calcularNotaFinal());
        System.out.println("\nEstado de estudiante3:");
        System.out.println(estudiante3.obtenerEstado());
        System.out.println("Nota Final: " + estudiante3.calcularNotaFinal());
    }
}
