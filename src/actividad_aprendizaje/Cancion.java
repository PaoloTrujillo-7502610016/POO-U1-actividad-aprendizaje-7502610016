package actividad_aprendizaje;

public class Cancion {
    String titulo;
    String artista;
    double duracion;

    static void mostrarInfo(String titulo,String artista,double duracion){
        System.out.println("Titulo: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Duracion: "+duracion);
    }

    public static void main(String[] args) {
        mostrarInfo("It's my life","Bon Jovi",4.5);
    }

}
