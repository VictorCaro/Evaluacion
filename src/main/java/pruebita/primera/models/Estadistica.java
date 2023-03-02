package pruebita.primera.models;

public class Estadistica {
    public static void calcularEstadisticas(Alumno[] alumnos) {
        // Se itera a través de cada objeto Alumno en el arreglo alumnos.
        for (Alumno alumno : alumnos) {
            // Se inicializan las variables de nota más alta, nota más baja y suma de notas a cero.
            double notaMasAlta = alumno.getNotas()[0];
            double notaMasBaja = alumno.getNotas()[0];
            double sumaNotas = 0;
            
            // Se itera a través de las notas del alumno actual.
            for (double nota : alumno.getNotas()) {
                // Si la nota actual es mayor que la nota más alta registrada hasta el momento, se actualiza la variable.
                if (nota > notaMasAlta) {
                    notaMasAlta = nota;
                }
                
                // Si la nota actual es menor que la nota más baja registrada hasta el momento, se actualiza la variable.
                if (nota < notaMasBaja) {
                    notaMasBaja = nota;
                }
                
                // Se suma la nota actual a la variable de suma de notas.
                sumaNotas += nota;
            }
            
            // Se calcula el promedio de notas del alumno actual.
            double promedio = sumaNotas / alumno.getNotas().length;
            
            // Se establecen las variables de nota más alta, nota más baja y promedio en el objeto Alumno correspondiente.
            alumno.setNotaMasAlta(notaMasAlta);
            alumno.setNotaMasBaja(notaMasBaja);
            alumno.setPromedio(promedio);
        }
    }
}
