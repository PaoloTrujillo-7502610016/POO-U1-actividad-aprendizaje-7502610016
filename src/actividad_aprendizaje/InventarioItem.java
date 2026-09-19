package actividad_aprendizaje;

public class InventarioItem {
    String nombre;
    int cantidad;
    float precioUnitario;

    public InventarioItem(String nombre, int cantidad, float precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio unitario: $"+precioUnitario);
    }

    float valorTotal(){
        return precioUnitario*cantidad;
    }

    static void main(String[] args) {
        InventarioItem inventario = new InventarioItem("Aceite", 10, 100);
        inventario.mostrar();
        System.out.println("Valor total del inventario: $"+inventario.valorTotal());

    }

}
