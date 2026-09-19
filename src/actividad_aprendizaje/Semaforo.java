package actividad_aprendizaje;

public class Semaforo {
    String colorActual;

    public Semaforo(String colorActual){
        this.colorActual=colorActual;
    }

    void cambiarColor(String colorActual){
        this.colorActual=colorActual;
    }

    static void main(String[] args) {
        Semaforo semaforo = new Semaforo("Rojo");
        System.out.println(semaforo.colorActual);
        semaforo.cambiarColor("Amarillo");
        System.out.println(semaforo.colorActual);
        semaforo.cambiarColor("Verde");
        System.out.println(semaforo.colorActual);
    }

}
