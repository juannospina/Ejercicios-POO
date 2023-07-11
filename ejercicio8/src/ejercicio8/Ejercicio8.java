package ejercicio8;

import Entity.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        CadenaServicio cs = new CadenaServicio();
        
        Cadena c1 = cs.ingresarFrase();
        
        
        System.out.println("Frase ingresada: "+c1.getFrase());
        String fraseSinContarEspacios = c1.getFrase().replace(" ", "");
        int fraseSinEspacios = fraseSinContarEspacios.length();
        System.out.println("Numero de caracteres: "+ fraseSinEspacios);
        
       
        cs.mostrarVocales(c1);
        System.out.print("Frase invertida: ");
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1, 'a');
        cs.compararLongitud(c1);
        cs.unirFrases(c1);
        System.out.print("Ingresa un caracter para reemplazar las (a/A): ");
        char caracter = entrada.next().charAt(0); // toca poner ese charAt al final pa que quite un error de conversion de string a char
        cs.reemplazar(caracter, c1);
        if(cs.contiene(c1)){
            System.out.println("Si, el caracter ingresado se encuentra en la frase");
        }else{
            System.out.println("No, el caracter ingresado no se encuentra en la frase");
        }
       
                
    }
    
}
