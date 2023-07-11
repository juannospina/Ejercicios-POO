/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2.entidades;

/**
 *
 * @author carol
 */
public class FiguraGeometrica {
    
    private String tipo;    
   private double base,altura,lado,diagonalpri,diagonalsec,radio,area,perimetro,apotema;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String tipo, double base, double altura, double lado, double diagonalpri, double diagonalsec, double radio, double area, double perimetro,double apotema) {
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.diagonalpri = diagonalpri;
        this.diagonalsec = diagonalsec;
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonalpri() {
        return diagonalpri;
    }

    public void setDiagonalpri(double diagonalpri) {
        this.diagonalpri = diagonalpri;
    }

    public double getDiagonalsec() {
        return diagonalsec;
    }

    public void setDiagonalsec(double diagonalsec) {
        this.diagonalsec = diagonalsec;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
     public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipo=" + tipo + ", area=" + area + ", perimetro=" + perimetro + '}';
    }



    
   
   
   
    
    
    
    
    
}
