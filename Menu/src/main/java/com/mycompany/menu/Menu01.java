package com.mycompany.menu;

import java.util.Scanner;

public class Menu01 {

    public class MenuProyectos {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int proyectosEjecutados = 0;

            while (proyectosEjecutados < 5) {
                System.out.println("--- Menú de Proyectos ---");
                System.out.println("1. Ejecutar Ejercicio01");
                System.out.println("2. Ejecutar Ejercicio02");
                System.out.println("3. Ejecutar Ejercicio03");
                System.out.println("4. Ejecutar Ejercicio04");
                System.out.println("5. Ejecutar Ejercicio05");
                System.out.println("6. Salir");

                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ejecutando Ejercicio01...");
                        // Coloca aquí el código para ejecutar el Proyecto 1
                        break;
                    case 2:
                        System.out.println("Ejecutando Ejercicio02...");
                        // Coloca aquí el código para ejecutar el Proyecto 2
                        break;
                    case 3:
                        System.out.println("Ejecutando Proyecto 3...");
                        // Coloca aquí el código para ejecutar el Proyecto 3
                        break;
                    case 4:
                        System.out.println("Ejecutando Proyecto 4...");
                        // Coloca aquí el código para ejecutar el Proyecto 4
                        break;
                    case 5:
                        System.out.println("Ejecutando Proyecto 5...");
                        // Coloca aquí el código para ejecutar el Proyecto 5
                        
                        break;
                    case 6:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }

                proyectosEjecutados++;
            }
        }
    }

}
