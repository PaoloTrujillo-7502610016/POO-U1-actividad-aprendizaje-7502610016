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
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Paolo Trujillo";
        estudiante.codigo = "7502610016";
        estudiante.semestre = 2;

        estudiante.mostrarInfo();
    }

}


