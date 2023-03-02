package pruebita.primera.models;

import java.util.Scanner;

public class Curso {
    private String nombreProfesor;
    private int cantidadAlumnos;

    public Curso() {
    }

    public Curso(String nombreProfesor, int cantidadAlumnos) {
        this.nombreProfesor = nombreProfesor;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    // Método para ingresar los datos del curso por teclado
    public void ingresarDatosCurso() {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre del profesor y lo guardamos en la variable nombreProfesor
        System.out.print("Ingrese el nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();
        this.nombreProfesor = nombreProfesor;

        // Pedimos la cantidad de alumnos en el curso y lo guardamos en la variable cantidadAlumnos
        System.out.print("Ingrese la cantidad de alumnos en el curso: ");
        int cantidadAlumnos = scanner.nextInt();
        this.cantidadAlumnos = cantidadAlumnos;

    }
}