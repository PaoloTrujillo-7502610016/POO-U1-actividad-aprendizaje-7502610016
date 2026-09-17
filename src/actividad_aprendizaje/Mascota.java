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

        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Palomin";
        mascota2.especie = "Perro";
        mascota2.edad = 12;
        mascota2.mostrarMascota();

        Mascota mascota3 = new Mascota();
        mascota3.nombre = "Kitty";
        mascota3.especie = "Gato";
        mascota3.edad = 4;
        mascota3.mostrarMascota();

        //Estos 3 objetos comparten los mismos atributos, cada objeto tiene un nombre, una especie y una edad. Pero cada uno tiene valores diferentes en sus atributos. Es decir, todos tienen un nombre pero cada uno tiene un nombre diferente; todos tienen edad pero cada uno tiene una edad diferente, y todos pertenecen a una especie, pero cada uno puede ser de una especie diferente.

    }

}
