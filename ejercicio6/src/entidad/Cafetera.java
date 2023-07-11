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
package entidad;

import java.util.Scanner;

public class Cafetera {
    Scanner entrada = new Scanner(System.in);
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public void llenarCafetera(){
        capacidadMaxima -= (capacidadMaxima - capacidadActual);
    }
    
    public int servirTaza(int tamanioTaza, int llenarTaza) {

        if (capacidadActual >= llenarTaza) {
            capacidadActual -= llenarTaza;
            llenarTaza = tamanioTaza - (tamanioTaza - llenarTaza);
            System.out.println("Se acaba de servir la cantidad que pidió");          
        } 
        if(capacidadActual < llenarTaza) {  
            llenarTaza = capacidadActual;
            System.out.println("La cafetera no cuenta con el suficiente café, por lo tanto se lleno con los que tenía: " + capacidadActual + " de cantidad");
            capacidadActual = 0;//no hay necesidad aqui del this porque no está como parametro.
            
        }
        return llenarTaza;
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
        System.out.println("La cafetera se ha vaciado");
    }
    
    public int agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe a llenar en la cafetera: ");
        int llenarCafetera = entrada.nextInt();
        capacidadMaxima -= (capacidadMaxima - llenarCafetera);
        return llenarCafetera;
    } 
    
    
}
