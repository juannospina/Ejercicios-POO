/*
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
    *Moverse: Es la cantidad de metros que avanzará por segundo.
    *Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
     más metros.
Referencias:
    *Un automóvil avanza 3 metros por segundo.
    *Una motocicleta avanza 2 metros por segundo.
    *Una bicicleta avanza 1 metro por segundo.
Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.
 */
package servicio;

import entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Vehiculo infoVehiculo(){
                
        Vehiculo v1 = new Vehiculo();
             
        System.out.println("Ingresa el tipo de vehículo (automovil, motocicleta, bicicleta): ");
        v1.setTipo(entrada.next());
        System.out.println("Ingresa la marca del vehiculo: ");
        v1.setMarca(entrada.next());
        System.out.println("Ingresa el modelo del vehículo: ");
        v1.setModelo(entrada.next());
        System.out.println("Ingresa el año del vehículo: ");
        v1.setAnio(entrada.nextInt());
        
        return v1;
    }
    
    public void moverse(Vehiculo v1, int segundos){ //tengo que poner como parametro el objeto para poder usar sus atributos en este metodo
 
        int metros = 0;
        int distancia = 0;
        
        switch (v1.getTipo()) {
            case "automóvil":
                metros = 3;               
                break;
            case "motocicleta":
                metros = 2;
                break;
            case "bicicleta":
                metros = 1;
                break;           
        }
        distancia = metros * segundos;
        System.out.println("El " + v1.getTipo() + " de marca " + v1.getMarca() + " y modelo " + v1.getModelo() + " avanzó " + distancia + " metros en " + segundos + " segundos.");
    }
    
    public void frenarse(Vehiculo v1, int minutos) {       
        int metrosFrenados = 0;
        int metros = 0;
        switch (v1.getTipo()) {
            case "automovil":
                metros= 3;
                break;
            case "motocicleta":
                metros = 2;
                break;
            case "bicicleta":
                metros = 1;
                break;
        }
        
        int metrosAvanzados = metros * minutos * 60;
        metrosFrenados = metrosAvanzados + 2;

        if (v1.getTipo().equals("bicicleta")) {
            System.out.println("La bicicleta se ha frenado y no ha avanzado más metros.");
        } else {
            System.out.println("El vehículo de tipo " + v1.getTipo() + " ha avanzado " + metrosAvanzados + " metros antes de frenar.");
            System.out.println("Tras frenar, el vehículo de tipo " + v1.getTipo() + " ha avanzado " + metrosFrenados + " metros en total.");
        }
        
    }
}
