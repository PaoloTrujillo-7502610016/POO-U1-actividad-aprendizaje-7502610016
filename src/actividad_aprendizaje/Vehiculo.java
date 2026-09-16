package actividad_aprendizaje;

public class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad: "+velocidadActual);
    }

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "FJ Land Cruiser 1980";
        vehiculo1.velocidadActual = 80;
        vehiculo1.mostrarEstado();

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Renault";
        vehiculo2.modelo = "Sandero 2005";
        vehiculo2.velocidadActual = 95;
        vehiculo2.mostrarEstado();
    }

}
