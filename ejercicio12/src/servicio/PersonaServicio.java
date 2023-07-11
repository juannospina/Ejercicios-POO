/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        p1.setNombre(entrada.nextLine());
        
        System.out.println("Ingresa la fecha de nacimiento: ");
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
        System.out.print("Mes ");
        int mes = entrada.nextInt();
        System.out.print("Año: ");
        int anio = entrada.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);//para agregar la info del usuario al atributo tipo date siempre se crea este objeto
        p1.setFechaNacimiento(fecha);//se le hace set y se le asigna la fecha anterior al atributo
        
        return p1;
    }
    
    public int calcularEdad(Persona p1){
        
        Date fechaActual = new Date();//Recordemos que el objeto de tipo Date cuando esta asi vacio, por default nos muestra la fecha actual.
        
        int getYear1 = p1.getFechaNacimiento().getYear();
        int getYear2 = fechaActual.getYear();
        int calcularEdad = getYear2 - getYear1;
        
        System.out.println("La edad de "+p1.getNombre()+" es de: "+calcularEdad+" años.");
        return calcularEdad;
        
    }
    
    public boolean menorQue(Persona p1, int edad2){
        Date fechaActual = new Date();
        
        int getYear1 = p1.getFechaNacimiento().getYear();
        int getYear2 = fechaActual.getYear();
        int calcularEdad = getYear2 - getYear1;
                
        boolean esMenor = calcularEdad < edad2;
        System.out.println("¿"+p1.getNombre()+" es menor?"+" "+esMenor);
        return esMenor;

        }
    
    public void mostrarPersona(Persona p1){
        System.out.println("Datos de la persona ingresada:");
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Fecha de nacimiento: "+p1.getFechaNacimiento());
    }
}
/*
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGetYear {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat getYearFormat = new SimpleDateFormat("dd/mm/yyyy");     // este es un formato que le podemos dar si queremos que la fecha se refleje asi.
        String currentYear = getYearFormat.format(date);
        System.out.println(currentYear);
        
    }
} 
*/
