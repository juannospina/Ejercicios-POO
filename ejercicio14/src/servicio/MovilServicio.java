/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package servicio;

import entidad.Movil;
import java.util.Scanner;

public class MovilServicio {
    Scanner entrada = new Scanner(System.in);
    public Movil cargarCelular(){
           
        Movil m1 = new Movil();
        
        System.out.println("==== Registro de teléfonos móviles ====");
        System.out.print("Ingresa la marca del celular: ");
        m1.setMarca(entrada.next());
        System.out.print("Ingresa su precio: ");
        m1.setPrecio(entrada.nextDouble());
        System.out.print("Ingresa su modelo: ");
        m1.setModelo(entrada.next());
        System.out.print("Ingresa el total de memoria RAM: ");
        m1.setMemoriaRam(entrada.nextInt());
        System.out.print("Ingresa el almacenamiento: ");
        m1.setAlmacenamiento(entrada.nextInt());
        
        return m1;
    }
    
    public void ingresarCodigo(Movil m1) {        

        int codigo [] = new int[7]; // Crear un nuevo arreglo para el código

        System.out.println("Ingrese el código completo de siete números del celular: ");

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            codigo[i] = entrada.nextInt();
        }
        m1.setCodigo(codigo);
    }
}