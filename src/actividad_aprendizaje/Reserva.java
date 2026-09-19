package actividad_aprendizaje;

public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Reserva(String nombreCliente, String fecha, boolean activa) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = activa;
    }

    void confirmar(){
        activa = true;
        System.out.println("Reserva confirmada");
    }
    void cancelar(){
        activa = false;
        System.out.println("Reserva cancelada");
    }

    static void main(String[] args) {
        Reserva reserva = new Reserva("Paolo", "12/12/2026", true);
        System.out.println("Cliente: "+reserva.nombreCliente);

        int opcion=2;//Se selecciona una opcion
        switch (opcion){
            case 1:reserva.confirmar();
            break;
            case 2:reserva.cancelar();
            break;
            default:System.out.println("Opción no válida");
        }

    }
}
