package actividad_aprendizaje;

public class Reloj {
    int hora;
    int minuto;
    int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    void mostrarHora(){
        System.out.println("La hora es: "+hora+":"+minuto+":"+segundo);
    }

    static void main(String[] args) {
        Reloj reloj = new Reloj(8,30,27);
        reloj.mostrarHora();
    }
}
