package actividad_aprendizaje;

public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    void encender(){
        prendido = true;
        System.out.println("Celular encendido");
    }

    void apagar(){
        prendido = false;
        System.out.println("Celular apagado");
    }

    void cargarBateria(int bateria){
        System.out.println("Porcentaje de bateria: "+bateria+"%");
        if(bateria>=100){
            System.out.println("No necesita cargarse");
        } else {
            System.out.println("Cargando bateria");
        }
    }

    static void main(String[] args) {
        Celular celular = new Celular();
        celular.marca = "Samsung";
        celular.encender();
        celular.cargarBateria(80);
        celular.cargarBateria(100);
        celular.apagar();
    }

}
