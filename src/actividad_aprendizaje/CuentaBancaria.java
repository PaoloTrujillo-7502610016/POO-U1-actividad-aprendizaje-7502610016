package actividad_aprendizaje;

public class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    void mostrarCuenta(){
        System.out.println("Numero: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: $"+saldo);
    }

    void consignar(double valor){
        saldo += valor;
    }

    void retirar(double valor){

        if(saldo >= valor){
            saldo -= valor;
        }else
            System.out.println("Saldo insuficiente");
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 123;
        cuenta1.titular = "Paolo";
        cuenta1.saldo = 500;
        cuenta1.mostrarCuenta();

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = 243;
        cuenta2.titular = "Daniela";
        cuenta2.saldo = 600;
        cuenta2.mostrarCuenta();
    }
}
