/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package libro;

import java.util.Scanner;

public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(int ISBM, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public int getISBN() {  // Acá no era necesario usar getter ni setters porque este ejercicio es facil y no se requiere modificar nongun atributo. Además recordemos que los atributos si estan en private se usan los getter y setters para poder acceder a ellos. 
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
        
    //Subproceso o metodo sin retorno para cargar los datos del libro
    public void cargarLibro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el ISBM del libro: ");
        this.ISBN = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresa el título del libro: ");
        this.titulo = entrada.nextLine();
        System.out.println("Ingresa el autor del libro: ");
        this.autor = entrada.nextLine();
        System.out.println("Ingresa el número de páginas del libro: ");
        this.paginas = entrada.nextInt();
    }
    //Subproceso o metodo sin void para mostrar en pantalla los datos que se cargaron de libro
    public void mostrarLibro(){
       System.out.println("Los datos del libro son: ");
       System.out.println("");
       System.out.println("ISBN: " + ISBN);
       System.out.println("Título: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Número de páginas: " + paginas);
    }
}

