package pruebita.primera.models;

public class Alumno {
    private String nombre;
    private String apellido;
    private double[] notas;
    private double promedio;
    private double notaMasAlta;
    private double notaMasBaja;
    
    // Constructor
    public Alumno(String nombre, String apellido, double[] notas) {
        this.nombre = nombre;   // Asigna el nombre recibido al atributo "nombre"
        this.apellido = apellido;   // Asigna el apellido recibido al atributo "apellido"
        this.notas = notas;   // Asigna las notas recibidas al atributo "notas"
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;   // Devuelve el valor del atributo "nombre"
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;   // Asigna el nombre recibido al atributo "nombre"
    }

    public String getApellido() {
        return apellido;   // Devuelve el valor del atributo "apellido"
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;   // Asigna el apellido recibido al atributo "apellido"
    }

    public double[] getNotas() {
        return notas;   // Devuelve el valor del atributo "notas"
    }

    public void setNotas(double[] notas) {
        this.notas = notas;   // Asigna las notas recibidas al atributo "notas"
    }

    public double getPromedio() {
        return promedio;   // Devuelve el valor del atributo "promedio"
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;   // Asigna el promedio recibido al atributo "promedio"
    }

    public double getNotaMasBaja() {
        return notaMasBaja;   // Devuelve el valor del atributo "notaMasBaja"
    }

    public void setNotaMasBaja(double notaMasBaja) {
        this.notaMasBaja = notaMasBaja;   // Asigna la nota más baja recibida al atributo "notaMasBaja"
    }

    public double getNotaMasAlta() {
        return notaMasAlta;   // Devuelve el valor del atributo "notaMasAlta"
    }

    public void setNotaMasAlta(double notaMasAlta) {
        this.notaMasAlta = notaMasAlta;   // Asigna la nota más alta recibida al atributo "notaMasAlta"
    }
    
}
