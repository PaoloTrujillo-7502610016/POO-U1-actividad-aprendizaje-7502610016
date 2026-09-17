package actividad_aprendizaje;

public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    void encender(){
        encendido = true;
        System.out.println("Ventilador encendido");
    }

    void apagar(){
        encendido = false;
        System.out.println("Ventilador apagado");
    }

    void subirVelocidad(){
        velocidad++;
        System.out.println("Velocidad actual: "+velocidad);
    }

    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();
        ventilador.marca = "Kalley";
        ventilador.velocidad = 50;
        ventilador.encender();
        ventilador.subirVelocidad();
        ventilador.subirVelocidad();
        ventilador.subirVelocidad();
        ventilador.apagar();
    }

}
