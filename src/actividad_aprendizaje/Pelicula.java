package actividad_aprendizaje;

public class Pelicula {
    String nombre;
    String genero;
    int minutos;

    static void mostrarFicha(String nombre, String genero, int minutos){
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Minutos: "+minutos);
    }

    public static void main(String[] args) {
        mostrarFicha("Shreek","Animada",90);
    }

}
