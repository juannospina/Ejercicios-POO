package ejercicio12;

import entidad.Persona;
import servicio.PersonaServicio;

public class Ejercicio12 {
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        
        ps.calcularEdad(p1);
        ps.menorQue(p1, 25);
        ps.mostrarPersona(p1);
        
        
        
    }
    
}
