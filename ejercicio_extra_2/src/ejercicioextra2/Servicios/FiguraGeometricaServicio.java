/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2.Servicios;

import ejercicioextra2.entidades.FiguraGeometrica;
import java.util.Scanner;

public class FiguraGeometricaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FiguraGeometrica crearFigura() {

        FiguraGeometrica f1 = new FiguraGeometrica();
        System.out.println("Ingresar la figura geometrica");
        f1.setTipo(leer.next().toLowerCase());

        switch (f1.getTipo()) {
            case "cuadrado":
                System.out.println("Ingresar el valor del lado");
                f1.setLado(leer.nextDouble());
                break;
            case "rectangulo":
                System.out.println("Ingresar el valor de la base");
                f1.setBase(leer.nextDouble());
                System.out.println("Ingresar el valor de la altura");
                f1.setAltura(leer.nextDouble());
                break;
            case "triangulo":
                System.out.println("Ingresar el valor de la base");
                f1.setBase(leer.nextDouble());
                System.out.println("Ingresar el valor de la altura");
                f1.setAltura(leer.nextDouble());
                break;
            case "circulo":
                System.out.println("Ingresar el valor del radio");
                f1.setRadio(leer.nextDouble());
                break;
            case "hexagono":
                System.out.println("Ingresar el valor del lado");
                f1.setLado(leer.nextDouble());
                System.out.println("Ingresar el valor de la apotema");
                f1.setApotema(leer.nextDouble());
                break;
            case "pentagono":
                System.out.println("Ingresar el valor del lado");
                f1.setLado(leer.nextDouble());
                System.out.println("Ingresar el valor de la apotema");
                f1.setApotema(leer.nextDouble());
                break;
            case "rombo":
                System.out.println("Ingresar el valor del lado");
                f1.setLado(leer.nextDouble());
                System.out.println("Ingresar el valor de la diagonal 1");
                f1.setDiagonalpri(leer.nextDouble());
                System.out.println("Ingresar el valor de la diagonal 2");
                f1.setDiagonalsec(leer.nextDouble());
                break;
            default:
                System.out.println("No ha seleccionado una figura geometrica");
                break;

        }

        return f1;
    }

    public void calculos(FiguraGeometrica f1) {

        switch (f1.getTipo()) {
            case "cuadrado":
                f1.setArea(Math.pow(f1.getLado(), 2));
                f1.setPerimetro(f1.getLado() * 4);
                break;
            case "rectangulo":
                f1.setArea(f1.getBase() * f1.getAltura());
                f1.setPerimetro((f1.getBase() * 2) + (f1.getAltura() * 2));
                break;
            case "triangulo":
                //Perimetro se debe calcular segun el tipo de triangulo
                f1.setArea((f1.getBase() * f1.getAltura()) / 2);

                break;
            case "circulo":
                f1.setArea(Math.PI * Math.pow(f1.getRadio(), 2));
                f1.setPerimetro(2 * Math.PI * f1.getRadio());
                break;
            case "hexagono":
                f1.setArea(3 * f1.getLado() * f1.getApotema());
                f1.setPerimetro(f1.getLado() * 6);
                break;
            case "pentagono":
                f1.setArea((5 * f1.getLado() * f1.getApotema())/2);
                f1.setPerimetro(f1.getLado() * 5);
                break;
            case "rombo":
                f1.setArea((f1.getDiagonalpri()*f1.getDiagonalsec())/2);
                f1.setPerimetro(f1.getLado() * 4);
                break;
            
        }

    }

    public FiguraGeometrica FiguraGeometrica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
