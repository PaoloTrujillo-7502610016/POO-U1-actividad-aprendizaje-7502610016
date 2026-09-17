package actividad_aprendizaje;

public class Libro {
    String titulo;
    String autor;

    //Constructor vacio
    public Libro() {
    }

    //Constructor con Parámetros
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Constructor copia
    public Libro(Libro copia) {
        this.titulo = copia.titulo;
        this.autor = copia.autor;
    }

    public static void main(String[] args){

        //Instancia con constructor vacio:
        Libro libro0 = new Libro();
        libro0.titulo = "La melancolia de los feos";
        libro0.autor = "Mario Mendoza";

        //Instancias con constructor con parametros:
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("Trading en la Zona", "Mark Douglas");
        Libro libro3 = new Libro("Harry Potter", "JK Grouling");
        Libro libro4 = new Libro("Del amor y otros demonis", "Gabriel Garcia Marquez");

        //Instancia con constructor copia
        Libro copia = new Libro(libro4);

        //Conclusion: la clase Libro es la plantilla porque define cuál sera la información que tendrá cada libro, esta plantilla define que cada libro debe tener un titulo y un autor. Los objetos libro1, libro2, etc, son las creaciones que surgen a partir de la plantilla de la clase, y cada uno tiene asignado un titulo y un autor, y puede suceder que los objetos la misma informacion, pero siguen siendo objetos diferentes.

        System.out.println(libro4.titulo+libro4.autor+copia.titulo+copia.autor);
    }
}
