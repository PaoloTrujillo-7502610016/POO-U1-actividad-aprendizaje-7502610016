package actividad_aprendizaje;

public class Lampara {
    String marca;
    boolean encendida;

    void encender(){
        encendida = true;
    }
    void apagar(){
        encendida = false;
    }

    void mostrarEstado(){
        if(encendida==true){
            System.out.println("Encendida");
        }else {
            System.out.println("Apagada");
        }
    }

    static void main(String[] args) {
        Lampara lampara = new Lampara();
        lampara.marca = "Phillip";
        lampara.encender();
        lampara.mostrarEstado();
        lampara.apagar();
        lampara.mostrarEstado();
    }

}
