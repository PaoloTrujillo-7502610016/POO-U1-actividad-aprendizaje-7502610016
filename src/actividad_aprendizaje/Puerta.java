package actividad_aprendizaje;

public class Puerta {

    String material;
    boolean abierta;

    void abrir(){
        abierta = true;
    }

    void cerrar(){
        abierta = false;
    }

    void mostrarEstado(){
        if(abierta == true){
            System.out.println("Puerta abierta");
        }else {
            System.out.println("Puerta cerrada");
        }
    }

    static void main(String[] args) {
        Puerta puerta = new Puerta();
        puerta.material ="Madera";
        puerta.abrir();
        puerta.mostrarEstado();
        puerta.cerrar();
        puerta.mostrarEstado();
    }

}
