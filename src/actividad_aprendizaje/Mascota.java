package actividad_aprendizaje;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad);
    }

    void cumplirAnios(){
        edad = edad+1;
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Nuby";
        mascota1.especie = "Gato";
        mascota1.edad = 6;
        mascota1.mostrarMascota();

    }

}
