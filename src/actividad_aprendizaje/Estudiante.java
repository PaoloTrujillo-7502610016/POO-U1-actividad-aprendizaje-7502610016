package actividad_aprendizaje;

public class Estudiante {
    String nombre;
    String codigo;
    int semestre;


    //Constructor vacio:
    public Estudiante() {
    }

    //Constructor con 2 parametros
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //Constructor con 3 parametros:
    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }


    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);
    }

    void cambiarSemestre(int nuevoSemestre){
        semestre = nuevoSemestre;
    }

    public static void main(String[] args) {
        //Instacia con constructor vacio:
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Paolo Trujillo";
        estudiante1.codigo = "7502610016";
        estudiante1.semestre = 2;
        estudiante1.mostrarInfo();

        //Instancia con constructor de 2 parametros:
        Estudiante estudiante2 = new Estudiante("Daniela", "7854785");
        estudiante2.mostrarInfo();

        //Instancia con constructor de 3 parametros:
        Estudiante estudiante3 = new Estudiante("Mauricio", "5487546", 8);
        estudiante3.mostrarInfo();


    }

    //Estudiante es una clase porque es el molde o plano que describe qué atributos tendra un estudiante y define los metodos de lo que puede hacer.
    //estudiante1 es la creacion hecha a partir del molde anterior. Un objeto tiene los valores concretos de sus atributos definidos en el molde.



}


