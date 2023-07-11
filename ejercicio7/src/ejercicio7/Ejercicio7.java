/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ejercicio7;

import entidad.Persona;

public class Ejercicio7 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        System.out.println("Ingresa los datos de la persona 1: ");
        p1.crearPersona();
        int imcPersona1 = p1.calcularIMC();
        boolean mayorDeEdadPersona1 = p1.mayorDeEdad();

        System.out.println("Ingresa los datos de la persona 2: ");
        p2.crearPersona();
        int imcPersona2 = p2.calcularIMC();
        boolean mayorDeEdadPersona2 = p2.mayorDeEdad();
        
        
        System.out.println("Ingresa los datos de la persona 3: ");
        p3.crearPersona();
        int imcPersona3 = p3.calcularIMC();
        boolean mayorDeEdadPersona3 = p3.mayorDeEdad();
        
        
        System.out.println("Ingresa los datos de la persona 4: ");
        p4.crearPersona();
        int imcPersona4 = p4.calcularIMC();
        boolean mayorDeEdadPersona4 = p4.mayorDeEdad();
        
        //Calcular porcentajes del peso
        int personasDebajoPeso = 0;
        int personasPesoIdeal = 0;
        int personasEncimaPeso = 0;

        if (imcPersona1 == -1) {
            personasDebajoPeso++;
        } else if (imcPersona1 == 0) {
            personasPesoIdeal++;
        } else {
            personasEncimaPeso++;
        }

        if (imcPersona2 == -1) {
            personasDebajoPeso++;
        } else if (imcPersona2 == 0) {
            personasPesoIdeal++;
        } else {
            personasEncimaPeso++;
        }

        if (imcPersona3 == -1) {
            personasDebajoPeso++;
        } else if (imcPersona3 == 0) {
            personasPesoIdeal++;
        } else {
            personasEncimaPeso++;
        }

        if (imcPersona4 == -1) {
            personasDebajoPeso++;
        } else if (imcPersona4 == 0) {
            personasPesoIdeal++;
        } else {
            personasEncimaPeso++;
        }
        

        // Calcular porcentaje de personas mayores y menores de edad
        int personasMayoresEdad = 0;
        int personasMenoresEdad = 0;

        if (mayorDeEdadPersona1) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }

        if (mayorDeEdadPersona2) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }

        if (mayorDeEdadPersona3) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }

        if (mayorDeEdadPersona4) {
            personasMayoresEdad++;
        } else {
            personasMenoresEdad++;
        }

        // Calcular porcentajes
        double porcentajeDebajoPeso = (double) personasDebajoPeso / 4 * 100;
        double porcentajePesoIdeal = (double) personasPesoIdeal / 4 * 100;
        double porcentajeEncimaPeso = (double) personasEncimaPeso / 4 * 100;
        
        double porcentajeMayorEdad = (double) personasMayoresEdad / 4 * 100;
        double porcentajeMenorEdad = (double) personasMenoresEdad / 4 * 100;
        
        System.out.println("Porcentaje personas con bajo peso: " + porcentajeDebajoPeso);
        System.out.println("Porcentaje personas con alto peso: " + porcentajeEncimaPeso);
        System.out.println("Porcentaje personas con peso ideal: " + porcentajePesoIdeal);
        System.out.println("Porcentaje personas mayores de edad: "+porcentajeMayorEdad);
        System.out.println("Porcentaje personas menores de edad: "+porcentajeMenorEdad);


    }

}
