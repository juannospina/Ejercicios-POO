/*
Método Static y Clase Math

Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package servicio;

import entidad.Matematica;
import java.util.Scanner;

public class MatematicaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double num1, num2;

    public Matematica crearMatematica() {

        System.out.println("Ingresa el primer número:");
        num1 = leer.nextDouble();
        System.out.println("Ingresa el segundo número:");
        num2 = leer.nextDouble();

        return new Matematica(num1, num2);

    }

    public double devolverMayor(Matematica mate) {
        
        double mayor = Math.max(num1, num2);
        return mayor;
    }

    public void calcularPotencia(Matematica mate) {

        double mayor = Math.round(Math.max(num1, num2));
        double menor = Math.round(Math.min(num1, num2));
        double potencia = Math.pow(mayor, menor);

        System.out.println("El numero mayor: " + mayor + " elevado a la potencia del"
                + " menor: " + menor + " es igual a: " + potencia);
    }

    public void raizCuadrada(Matematica mate) {

        double menor = Math.abs(Math.min(num1, num2));
        double raiz = Math.sqrt(menor);

        System.out.println("La raiz cuadrada del numero más pequeño es:");
        System.out.println(raiz);
    }
   
   
}