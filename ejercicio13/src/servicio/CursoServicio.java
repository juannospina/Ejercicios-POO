/*
Uso de vectores como atributos de clase

Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package servicio;

import entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner entrada = new Scanner(System.in);

    public Curso crearCurso() {

        Curso c1 = new Curso();

//        System.out.print("Ingresa el nombre del curso: ");
//        c1.setNombreCurso(entrada.next());
//        System.out.print("Ingresa la cantidad de horas por dia: ");
//        c1.setCantidadHorasPorDia(entrada.nextInt());
//        System.out.print("Ingresa cantidad de dias por semana: ");
//        c1.setCantidadDiasPorSemana(entrada.nextInt());
//        System.out.print("Ingresa el turno (mañana/tarde): ");
//        c1.setTurno(entrada.next());
//        System.out.print("Ingresa el precio por hora: ");
//        c1.setPrecioPorHora(entrada.nextDouble());
//        cargarAlumnos();
        System.out.print("Ingresa el nombre del curso: ");
        String nombreCurso = entrada.next();
        System.out.print("Ingresa la cantidad de horas por dia: ");
        int cantidadHorasPorDia = entrada.nextInt();
        System.out.print("Ingresa cantidad de dias por semana: ");
        int cantidadDiasPorSemana = entrada.nextInt();
        System.out.print("Ingresa el turno (mañana/tarde): ");
        String turno = entrada.next();
        System.out.print("Ingresa el precio por hora: ");
        double precioPorHora = entrada.nextDouble();
       
        cargarAlumnos(c1);

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, c1.getAlumnos());//aca como atributo final como es un string se pone llamandolo desde el objeto ya que mire que no se solicita anteriormente con el scanner

    }

    public Curso cargarAlumnos(Curso c1) {

        String[] alumnos = new String[5];

        //almacenar alumnos al atributo de tipo array
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el alumno " + (i + 1) + ": ");
            alumnos[i] = entrada.next();
        }
        c1.setAlumnos(alumnos);
        //mostrar alumnos
        // for (int i = 0; i < 5; i++) {
        //  System.out.print("["+c1.getAlumnos()[i]+"]");
        // }       
        
        return c1;
    }
    
    public double calcularGananciaSemanal(Curso c1){
        double gananciaSemanal = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora()* 5 * c1.getCantidadDiasPorSemana();  
        return gananciaSemanal;
    }
    
}
