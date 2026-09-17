package actividad_aprendizaje;

public class Producto {
    String nombre;
    double precio;
    int stock;

    //Constructor vacio:
    public Producto() {}

    //Constructor con parametros:
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Stock: "+stock);
    }

    //Metodo static
    static void crearProductoBasico(String nombre, double precio, int stock) {
        Producto nuevoProducto = new Producto();
        //El metodo funciona como constructor con parametros
        nuevoProducto.nombre = nombre;
        nuevoProducto.precio = precio;
        nuevoProducto.stock = stock;
        nuevoProducto.mostrarProducto();
    }

    void vender(int cantidad){
        stock -= cantidad;
    }

    void reabastecer(int cantidad){
        stock += cantidad;
    }



    public static void main(String[] args) {
        //Instancia con constructor vacio:
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

        //Instancia con constructor parametrizado
        Producto producto3 = new Producto("Azucar",4300,13);
        producto3.mostrarProducto();

        //Creacion de objeto con metodo static
        crearProductoBasico("Harina",4800,7);
        crearProductoBasico("Huevos",600,70);

    }


}
