package com.mycompany.menu;

public class Menu {

    public static void main(String[] args) {
        import java.util.ArrayList;
        import java.util.Scanner;

        class Proyecto {

            private String nombre;
            private String descripcion;

            public Proyecto(String nombre, String descripcion) {
                this.nombre = nombre;
                this.descripcion = descripcion;
            }

            public String getNombre() {
                return nombre;
            }

            public String getDescripcion() {
                return descripcion;
            }
        }



    

    public class MenuProyectos {

        public static void main(String[] args) {
            ArrayList<Proyecto> listaProyectos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n--- Menú de Proyectos ---");
                System.out.println("1. Agregar Proyecto");
                System.out.println("2. Listar Proyectos");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        scanner.nextLine(); // Limpiar el buffer
                        System.out.print("Nombre del proyecto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Descripción del proyecto: ");
                        String descripcion = scanner.nextLine();
                        Proyecto proyecto = new Proyecto(nombre, descripcion);
                        listaProyectos.add(proyecto);
                        System.out.println("Proyecto agregado con éxito.");
                        break;
                    case 2:
                        System.out.println("\n--- Listado de Proyectos ---");
                        for (int i = 0; i < listaProyectos.size(); i++) {
                            Proyecto p = listaProyectos.get(i);
                            System.out.println("Proyecto " + (i + 1) + ":");
                            System.out.println("Nombre: " + p.getNombre());
                            System.out.println("Descripción: " + p.getDescripcion());
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del programa.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
        }
    }

}
