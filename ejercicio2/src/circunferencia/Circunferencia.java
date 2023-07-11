/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package circunferencia;

import java.util.Scanner;

public class Circunferencia {
    Scanner entrada = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        System.out.print("Ingresa el radio de la circunferencia: ");
        this.radio = entrada.nextDouble();
    }
    public void area(){
        System.out.println("El área de la circunferenciia es de: "+(Math.PI*(Math.pow(this.radio, 2))));
    }
    public void perimetro(){
        System.out.println("El perimetro de la circuenferencia es de: "+(2*Math.PI*this.radio));
    }
}
