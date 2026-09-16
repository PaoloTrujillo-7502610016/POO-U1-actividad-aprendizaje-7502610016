package actividad_aprendizaje;

public class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Stock: "+stock);
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "Arroz";
        producto1.precio = 2300;
        producto1.stock = 10;
        producto1.mostrarProducto();

        Producto producto2 = new Producto();
        producto2.nombre = "Aceite";
        producto2.precio = 7600;
        producto2.stock = 15;
        producto2.mostrarProducto();

        Producto producto3 = new Producto();
        producto3.nombre = "Azucar";
        producto3.precio = 4300;
        producto3.stock = 13;
        producto3.mostrarProducto();
    }


}
