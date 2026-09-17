package actividad_aprendizaje;

public class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    //Constructor con parametros
    public CuentaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

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
        //Instancias con constructor con parametros.
        CuentaBancaria cuenta1 = new CuentaBancaria(1234, "Paolo",500);
        cuenta1.mostrarCuenta();
        CuentaBancaria cuenta2 = new CuentaBancaria(234, "Daniela",600);
        cuenta2.mostrarCuenta();
        CuentaBancaria cuenta3 = new CuentaBancaria(345, "Gabriel",580);
        cuenta3.mostrarCuenta();
    }
}
