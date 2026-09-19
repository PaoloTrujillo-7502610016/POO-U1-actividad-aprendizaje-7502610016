package actividad_aprendizaje;

public class FacturaSimple {
    int numero;
    String cliente;
    float valor;

    public FacturaSimple(int numero, String cliente, float valor){
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    void mostrarFactura(){
        System.out.println("Numero de factura: " + this.numero);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Valor: $" + this.valor);
    }

    void aplicarDescuento(){
        float descuento = valor * 0.1f;
        valor = valor - descuento;
        System.out.println("Valor con descuento del 10%: $" + valor);
    }

    static void main(String[] args) {
        FacturaSimple facturaSimple = new FacturaSimple(123, "Paolo", 10000);
        facturaSimple.mostrarFactura();
        facturaSimple.aplicarDescuento();
    }

}
