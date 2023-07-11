/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6;

import entidad.Cafetera;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cafetera c1 = new Cafetera(500, 200);
        
        System.out.println("Capacidad máxima de la cafetera: " + c1.getCapacidadMaxima());
        System.out.println("Cantidad actual de café en la cafetera: " + c1.getCapacidadActual());
        
        System.out.println("\nLlenando la cafetera...");
        c1.llenarCafetera();
        System.out.println("Cantidad actual de café en la cafetera: " + c1.getCapacidadActual());
        
        System.out.println("\nIngrese el tamaño de la taza: ");
        int tamanioTaza = entrada.nextInt();
        System.out.println("¿Cuánta cantidad de café desea llenar?: ");
        int llenarTaza = entrada.nextInt();
        c1.servirTaza(tamanioTaza, llenarTaza);
      
        if (llenarTaza == tamanioTaza) {
            llenarTaza = tamanioTaza;
            System.out.println("La taza se encuentra llena");
        
        } else if (llenarTaza < tamanioTaza) {
            System.out.println("La taza aun cuenta con " + (tamanioTaza - llenarTaza) + " de café disponible");

        } else {
            System.out.println("Error, la cantidad deseada es mayor al tamaño de la taza");

        }
        if(c1.getCapacidadActual() > 0){            
            System.out.println("Ahora la cafetera cuenta con "+c1.servirTaza(tamanioTaza, llenarTaza)+" disponible");
        }else{
            System.out.println("La cafetera ya no cuenta con café");
        }    
    }
    
}
