package actividad_aprendizaje;

public class Empleado {
    String nombre;
    String cargo;
    double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    void mostrarEmpleado(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
    }

    static void main(String[] args) {
        //Modelado con clase y objeto:
        Empleado empleado1 = new Empleado("Juan", "Analista", 5000);
        empleado1.mostrarEmpleado();

        //Modelado con variables sueltas
        String nombre = "Pablo";
        String cargo = "Asesor";
        double salario = 10000;

        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);

    }

    //Modelar un Empleado mediante una clase y objetos es más conveniente porque permite representar de forma organizada sus atributos y métodos, manteniendo juntos los datos y comportamientos relacionados. A diferencia de la programación estructurada, secuencial o procedural, donde se trabajarían variables sueltas y funciones independientes, la Programación Orientada a Objetos permite crear objetos que representan empleados reales, facilitando la organización, reutilización, encapsulamiento y mantenimiento del código.

}
