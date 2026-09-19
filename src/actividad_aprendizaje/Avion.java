package actividad_aprendizaje;

public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    void abordar(int cantidad){
        pasajeros += cantidad;
        System.out.println("Pasajeros abordados: "+cantidad);
        System.out.println("Total de pasajeros: "+pasajeros);
    }

    static void main(String[] args) {
        Avion avion = new Avion("Wingo","Cartagena",35);
        System.out.println("Aerolinea: "+avion.aerolinea);
        System.out.println("Destino: "+avion.destino);
        avion.abordar(13);
    }
}
