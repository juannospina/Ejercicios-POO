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
package ejercicio.extra1;

import entidad.Vehiculo;
import servicio.VehiculoServicio;

public class Ejercicio_extra_1 {
    public static void main(String[] args) {
        VehiculoServicio vs = new VehiculoServicio();
        Vehiculo v1 = vs.infoVehiculo();
        Vehiculo v2 = vs.infoVehiculo();
        Vehiculo v3 = vs.infoVehiculo();
        
        System.out.println("Avance de los vehículos durante 5 segundos:");
        vs.moverse(v1, 5);
        vs.moverse(v2, 5);
        vs.moverse(v3, 5);
        
        System.out.println("\nAvance de los vehículos durante 5 segundos:");
        vs.moverse(v1, 10);
        vs.moverse(v2, 10);
        vs.moverse(v3, 10);
        
        System.out.println("\nAvance de los vehículos durante 5 segundos:");
        vs.moverse(v1, 60);
        vs.moverse(v2, 60);
        vs.moverse(v3, 60);
        
        System.out.println("\nAvance después de frenar durante 5 minutos:");
        vs.frenarse(v1, 5);
        vs.frenarse(v2, 5);
        vs.frenarse(v3, 5);
        
    }
    
}
