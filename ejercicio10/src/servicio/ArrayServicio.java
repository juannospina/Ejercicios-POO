/*
Clase Arrays

Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package servicio;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayServicio {

    double[] arrayA = new double[50];
    double[] arrayB = new double[20];

    public double[] rellenarArrayA() {

        for (int i = 0; i < arrayA.length; i++) { // for para generar los numeros aleatorios
            arrayA[i] = (double) (Math.random() * 10 + 1);
        }

        System.out.println("Arreglo A desordenado: ");
        mostrarArreglo(arrayA); // se llama el metodo que creamos abajo

        Arrays.sort(arrayA); // con el metodo .sort se ordena el vector.

        System.out.println("\nArreglo A ordenado: ");

        mostrarArreglo(arrayA); // se llama el metodo que creamos abajo

        System.out.println("");
        return arrayA;

    }

    public double[] rellenarArrayB() {

        System.arraycopy(arrayA, 0, arrayB, 0, 10);//Método .arraycopy que copia desde la posición origen de un array a un array destino en una posición específica (el ejercicio nos pide copiar los 10 primeros elementos de A para pegarlos en B)
        Arrays.fill(arrayB, 10, 20, 0.5); // metodo .fill la cual los dos primeros numeros es el rango de posiciones, y el ultimo numero es el valor la cual queremos llenar.
        System.out.println("Arreglo B: ");
        mostrarArreglo(arrayB);
        return arrayB;
    }

    public void mostrarArreglo(double[] arreglo) { //vemos que tenemos un parametro tipo vector, las cuales son los vectores A o B. (arriba se usan estos metodos)
        DecimalFormat df = new DecimalFormat("0.00"); //aca es para acortar tantos decimales en solo dos, por lo tanto se usa esta clase la cual se tiene que crear este objeto.
        for (double elemento : arreglo) { //ir recorriendo hasta el tamaño del "arreglo"
            System.out.print("[ " + df.format(elemento) + "] ");
        }
        System.out.println();
    }

}
