package com.mycompany.ejempllovectores;

public class Colegio {

    private String nombre;
    private long nit;
    //vector de estudiante
    private Estudiante estudiantes[];

    public Colegio(String nombre, long nit) {
        this.nombre = nombre;
        this.nit = nit;
        estudiantes = new Estudiante[10];

    }

    public void registrarNombreEstudiante(Estudiante estudiante, int posicion) {
        estudiantes[posicion] = estudiante;

    }

    public void mostrarNombreEstudiantes() {

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre());

        }
    }
}
