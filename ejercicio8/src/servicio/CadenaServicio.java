/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package servicio;

import Entity.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Cadena ingresarFrase(){
       
        Cadena c1 = new Cadena();
        
        System.out.println("Ingresa una frase: ");
        
        c1.setFrase(entrada.nextLine());
        c1.setLongFrase(c1);       
        
        return c1;
    }
    
    public void mostrarVocales(Cadena c1){
        int contador = 0;
        for (int i = 0; i < c1.getLongFrase(); i++) {
            char vocal = c1.getFrase().charAt(i);
            
            if(vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
                contador++;
            }            
        }
        System.out.println("La frase tiene un total de "+contador+" vocales");
    }
    
    public void invertirFrase(Cadena c1){
        String fraseInvertida = "";
        
        for (int i = c1.getFrase().length() - 1; i >= 0; i--) {
            fraseInvertida += c1.getFrase().charAt(i);
        }
        
        System.out.println(fraseInvertida);
    }
    
    public void vecesRepetido(Cadena c1, char caracter){
        int contador = 0;
        for (int i = 0; i < c1.getLongFrase(); i++) {
            if(caracter == c1.getFrase().charAt(i)){
                contador++;
            }         
        }
        System.out.println("El caracter "+caracter+" se repite "+contador+" veces");
    }

    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese una nueva frase: ");
        String frase2 = entrada.nextLine();
        String sinEspacio = c1.getFrase().replace(" ", "");
        String sinEspacio2 = frase2.replace(" ", "");
        int longitud1 = sinEspacio.length();
        int longitud2 = sinEspacio2.length();
        if (longitud1 > longitud2) {
            System.out.println("La frase original es más larga que la nueva frase ingresada");
        } else if (longitud1 < longitud2) {
            System.out.println("La nueva frase ingresada es más larga que la frase original");
        } else {
            System.out.println("Ambas frases tienen la misma longitud");
        }
    }
    
    public void unirFrases(Cadena c1){
        System.out.println("Ingresa otra frase: ");
        String frase2 = entrada.nextLine();
        System.out.println("Cadenas unidas: "+c1.getFrase()+" "+frase2);         
    }
    
    public void reemplazar(char caracter, Cadena c1){        
        System.out.println(c1.getFrase().replace('a', caracter));
    }
    
    public boolean contiene (Cadena c1){
        System.out.print("Ingresa una letra a buscar en la frase: ");
        String letra = entrada.next();
        return c1.getFrase().contains(letra);        
    }   
}
