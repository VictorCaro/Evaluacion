package pruebita.primera;

import java.util.Scanner;
import pruebita.primera.models.Alumno;
import pruebita.primera.models.Curso;

public class PrimeraApplication {

    public static void main(String[] args) {
		Curso curso1 = new Curso(); // Se crea una instancia de la clase Curso
		curso1.ingresarDatosCurso(); // Se llama al método ingresarDatosCurso() para ingresar los datos del curso
		Alumno[] alumnos = new Alumno[curso1.getCantidadAlumnos()]; // Se crea un arreglo de Alumnos con la cantidad de alumnos ingresados en el curso

		Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
		System.out.println("Ingresar datos de alumnos:");
		for (int i = 0; i < alumnos.length; i++) { // Se itera sobre los alumnos en el arreglo
			System.out.println("Alumno " + (i+1) + ":");
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine(); // Se lee el nombre del alumno
			System.out.print("Apellido: ");
			String apellido = scanner.nextLine(); // Se lee el apellido del alumno
			System.out.print("Cantidad de evaluaciones: ");
			int cantidadEvaluaciones = scanner.nextInt(); // Se lee la cantidad de evaluaciones del alumno
			scanner.nextLine(); // Se consume el salto de línea pendiente

			double[] notas = new double[cantidadEvaluaciones]; // Se crea un arreglo para almacenar las notas del alumno
			for (int j = 0; j < cantidadEvaluaciones; j++) { // Se itera sobre las evaluaciones del alumno
				System.out.print("Nota " + (j+1) + ": ");
				notas[j] = scanner.nextDouble(); // Se lee la nota de la evaluación
				scanner.nextLine(); // Se consume el salto de línea pendiente
			}
			double promedio = calcularPromedio(notas); // Se calcula el promedio de las notas del alumno
			double notaMasAlta = calcularNotaMasAlta(notas); // Se busca la nota más alta del alumno
			double notaMasBaja = calcularNotaMasBaja(notas); // Se busca la nota más baja del alumno

			alumnos[i] = new Alumno(nombre, apellido, notas); // Se crea un objeto Alumno con los datos del alumno
			alumnos[i].setPromedio(promedio); // Se establece el promedio del alumno
			alumnos[i].setNotaMasAlta(notaMasAlta); // Se establece la nota más alta del alumno
			alumnos[i].setNotaMasBaja(notaMasBaja); // Se establece la nota más baja del alumno
		}

		System.out.println("\nDatos de los alumnos:\n");
		for (Alumno alumno : alumnos) { // Se itera sobre los alumnos en el arreglo
			System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
			System.out.println("Notas: " + java.util.Arrays.toString(alumno.getNotas())); // Se muestra el arreglo de notas del alumno
			System.out.println("Promedio: " + alumno.getPromedio());
			System.out.println("Nota más alta: " + alumno.getNotaMasAlta());
			System.out.println("Nota más baja: " + alumno.getNotaMasBaja() + "\n");
			scanner.close(); // Se cierra el objeto Scanner
		}
	}
	
	// Este método calcula el promedio de un array de notas
private static double calcularPromedio(double[] notas) {
    double suma = 0;
    for (double nota : notas) {
        suma += nota; // Sumamos todas las notas en la variable "suma"
    }
    return suma / notas.length; // Calculamos el promedio y lo retornamos
}

// Este método calcula la nota más alta de un array de notas
private static double calcularNotaMasAlta(double[] notas) {
    double notaMasAlta = notas[0]; // Asignamos la primera nota como la más alta
    for (int i = 1; i < notas.length; i++) { // Recorremos las notas desde la segunda posición
        if (notas[i] > notaMasAlta) { // Si la nota actual es mayor que la más alta
            notaMasAlta = notas[i]; // Actualizamos la nota más alta con la actual
        }
    }
    return notaMasAlta; // Retornamos la nota más alta
}

// Este método calcula la nota más baja de un array de notas
private static double calcularNotaMasBaja(double[] notas) {
    double notaMasBaja = notas[0]; // Asignamos la primera nota como la más baja
    for (int i = 1; i < notas.length; i++) { // Recorremos las notas desde la segunda posición
        if (notas[i] < notaMasBaja) { // Si la nota actual es menor que la más baja
            notaMasBaja = notas[i]; // Actualizamos la nota más baja con la actual
        }
    }
    return notaMasBaja; // Retornamos la nota más baja
}
	
	
}
