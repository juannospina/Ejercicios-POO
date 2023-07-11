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
package cuenta;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private int saldo;
    
    Scanner entrada = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(int numeroCUenta, int DNI, int saldo) {
        this.numeroCuenta = numeroCUenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCUenta() {
        return numeroCuenta;
    }

    public void setNumeroCUenta(int numeroCUenta) {
        this.numeroCuenta = numeroCUenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void cuenta(){
        
        System.out.print("Ingresa el número de la cuenta: ");
        numeroCuenta = entrada.nextInt();
        System.out.print("Ingresa el DNI: ");
        DNI = entrada.nextInt();
        System.out.print("Ingresa el saldo: ");
        saldo = entrada.nextInt();
    }
    public double ingreso(){        
        System.out.print("¿Cuánto dinero desea ingresar?: ");
        double saldoActual = entrada.nextDouble();
        saldo = (int) (saldoActual + saldo);
        return saldo;
    }
    
    public double retiro(){        
        System.out.print("¿Cuánto dinero desea retirar?: ");
        double retiro = entrada.nextDouble();
        
        if(this.saldo < retiro){
            System.out.println("Error, no tienes el saldo suficiente para retirar lo solicitado");
            return 0;
        }else{
            System.out.println("Saldo retirado satisfactoriamente");
            this.saldo -= retiro;
            return saldo;
        }
    }
    
    public double extraccionRapida(){
        System.out.println("Has acabado de retirar el 20% del total de su saldo");
        this.saldo -= (this.saldo * 0.2);  
        return saldo;
    }
    
    public void consultarSaldo(){        
        System.out.println("Su saldo disponible es de: "+this.saldo);// uso el this.saldo para que me imprima el saldo ya actualizado.
    }
    
    public void consultarDatos(){
        System.out.println("Número de la cuenta: "+numeroCuenta);
        System.out.println("DNI: "+DNI);
        System.out.println("Saldo: "+this.saldo);    
    }
}
