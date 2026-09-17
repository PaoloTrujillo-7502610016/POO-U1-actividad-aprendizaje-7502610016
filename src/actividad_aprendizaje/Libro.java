package actividad_aprendizaje;

public class Libro {
    String titulo;
    String autor;

    public Libro() {//Constructor vacio
    }

    public Libro(String titulo, String autor) {//Constructor con Parámetros
        this.titulo = titulo;
        this.autor = autor;
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

        //Conclusion: la clase Libro es la plantilla porque define cuál sera la información que tendrá cada libro, esta plantilla define que cada libro debe tener un titulo y un autor. Los objetos libro1, libro2, etc, son las creaciones que surgen a partir de la plantilla de la clase, y cada uno tiene asignado un titulo y un autor, y puede suceder que los objetos la misma informacion, pero siguen siendo objetos diferentes.
    }
}
