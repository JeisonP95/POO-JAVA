package com.mycompany.ejercicio02;

public class Estudiante {

    private double nota1;
    private double nota2;
    private double nota3;
    private String nombre;
    private int edad;
    
    // Constructor por defecto
    public Estudiante() {
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        nombre = "";
        edad = 0;
    }

    // Constructor parametrizado
    public Estudiante(double nota1, double nota2, double nota3, String nombre, int edad) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor con nombre y edad (notas en 0 por defecto)
    public Estudiante(String nombre, int edad) {
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nombre = nombre;
        this.edad = edad;
    }

   

    // Métodos para obtener y establecer los atributos
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para calcular y retornar la nota final del estudiante
    public double calcularNotaFinal() {
        // Calcular la nota final como el promedio ponderado de las tres notas
        double notaFinal = (((nota1 + nota2)/2)* 0.7 + nota3 * 0.3);
        return notaFinal;
    }

    // Método para obtener el estado de todos los atributos de la clase
    public String obtenerEstado() {
        return "Nombre: " + nombre +  " Edad: " + edad +  " Nota 1: " + nota1 +  "    Nota 2: " + nota2 +  "    Nota 3: " + nota3;
    }

}
