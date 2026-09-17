package actividad_aprendizaje;

public class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);
    }

    void cambiarSemestre(int nuevoSemestre){
        semestre = nuevoSemestre;
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Paolo Trujillo";
        estudiante1.codigo = "7502610016";
        estudiante1.semestre = 2;

        estudiante1.mostrarInfo();
    }

    //Estudiante es una clase porque es el molde o plano que describe qué atributos tendra un estudiante y define los metodos de lo que puede hacer.
    //estudiante1 es la creacion hecha a partir del molde anterior. Un objeto tiene los valores concretos de sus atributos definidos en el molde.



}


