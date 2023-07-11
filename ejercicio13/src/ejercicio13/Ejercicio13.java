package ejercicio13;

import entidad.Curso;
import java.util.Arrays;
import servicio.CursoServicio;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        CursoServicio cs = new CursoServicio();
        
        Curso c1 = cs.crearCurso();
      

        System.out.println("\nDetalles del curso:");
        System.out.println("Nombre del curso: " + c1.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + c1.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + c1.getCantidadDiasPorSemana());
        System.out.println("Turno: " + c1.getTurno());
        System.out.println("Precio por hora: " + c1.getPrecioPorHora());

        System.out.println("\nAlumnos del curso:");
        String [] alumnos = c1.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alumnos[i]);
        }
        
        System.out.println("Ganancia semanal del curso: "+cs.calcularGananciaSemanal(c1));

      
//System.out.println(Arrays.toString(c1.getAlumnos())); // para que no me muestre el vector asi: [Andres][Camilo] sino asi: [Andres, Camilo], es decir usamos el ToString

    }
    
}
