/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5;

import cuenta.Cuenta;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa los datos de la cuenta bancaria");
        c1.cuenta();
        
        do {
            System.out.println("");
            System.out.println("============= MENU =============");
            System.out.println("");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extracción rápida (20% del saldo)");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.println("================================");

            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    c1.ingreso();
                    break;
                case 2:
                    c1.retiro();
                    break;
                case 3:
                    c1.extraccionRapida();
                    break;
                case 4:
                    c1.consultarSaldo();
                    break;
                case 5:
                    System.out.println("");
                    c1.consultarDatos();
                    break;
                case 6:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Error, dato no válido, intentalo de nuevo");
                    break;
            }

        } while (opcion != 6);
        

        
    }
    
}
