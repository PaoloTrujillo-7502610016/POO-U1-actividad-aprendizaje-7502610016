package actividad_aprendizaje;

public class Computador {
    String tipo;
    String marca;
    String modelo;

    public Computador(String tipo, String marca, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    void mostrarComputador(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }

    static void main(String[] args) {
        Computador compu1 = new Computador("Portatil", "Lenovo", "Thinkpad");
        compu1.mostrarComputador();
        Computador compu2  = new Computador("CPU", "Dell", "Optiplex");
        compu2.mostrarComputador();
    }
}
    //la clase Computador define la estructura y los comportamientos; el objeto compu1 y compu2 representa un computador específico con sus propios valores.
