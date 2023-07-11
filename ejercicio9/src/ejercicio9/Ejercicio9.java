package ejercicio9;

import entidad.Matematica;
import servicio.MatematicaServicio;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        
        MatematicaServicio ms = new MatematicaServicio();
        Matematica mate = ms.crearMatematica();
        
        ms.devolverMayor(mate);
        double mayor = ms.devolverMayor(mate);
        System.out.println("El numero mayor es: "+ mayor);
        
        ms.calcularPotencia(mate);
        ms.raizCuadrada(mate);
    }
    
}
