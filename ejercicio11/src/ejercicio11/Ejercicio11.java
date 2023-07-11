/*
Clase Date
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el dia: ");
        int dia = entrada.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = entrada.nextInt();

        System.out.print("Ingresa el año: ");
        int anio = entrada.nextInt();

        Date fecha = new Date(anio - 1900, mes, dia);
        Date fechaActual = new Date();

        System.out.println("La fecha ingresada por el usuario es: " + fecha);
        System.out.println("La fecha actual es: " + fechaActual);

        int getYears1 = fechaActual.getYear(); //metodo de la clase Date para obtener el año;
        int getYears2 = fecha.getYear();
        int operacion = getYears1 - getYears2; //resta de ambos años
        if (operacion < 0) {
            System.out.println("El tiempo de diferencia entre años es: " + operacion * - 1 + " Años Mas");// por -1 para convertir el resultado a positivo (no existe años negativos)
        } else {
            System.out.println("El tiempo de diferencia entre años es: " + operacion + " Años Menos");
        }
        
        
        
        
        
    }
    
}
