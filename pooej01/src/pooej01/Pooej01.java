package pooej01;

import entidad.Persona;

public class Pooej01 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Juancho", 26);// llamado desde el constructor
        //System.out.println(p1.nombre+" "+p1.apodo+" "+p1.edad);
        
        p1.setNombre("Camilo"); 
        System.out.println(p1);
    }    
}
