
package ejercicioextra2;

import ejercicioextra2.Servicios.FiguraGeometricaServicio;
import ejercicioextra2.entidades.FiguraGeometrica;

public class EjercicioExtra2 {

    public static void main(String[] args) {
        
        
        FiguraGeometricaServicio fig1 = new FiguraGeometricaServicio();
        FiguraGeometrica f1 = fig1.crearFigura();
        fig1.calculos(f1);
       
        System.out.println("Figura 1" + f1);
    }
    
}
