package ejercicio14;

import entidad.Movil;
import servicio.MovilServicio;

public class Ejercicio14 {
    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();
        
        Movil m1 = ms.cargarCelular();
        
        System.out.println("\nDetalles del celular:");
        System.out.println("Marca: " + m1.getMarca());
        System.out.println("Precio: " + m1.getPrecio());
        System.out.println("Modelo: " + m1.getModelo());
        System.out.println("Memoria RAM: " + m1.getMemoriaRam());
        System.out.println("Almacenamiento: " + m1.getAlmacenamiento());
        
        ms.ingresarCodigo(m1);

        System.out.print("Código: ");
        int[] codigo = m1.getCodigo();
        for (int i = 0; i < 7; i++) {
            System.out.print("\n"+codigo[i]);
        }        
    }            
}
