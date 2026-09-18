package actividad_aprendizaje;

public class Curso {
    String titulo;
    String tutor;

    public Curso(String titulo, String tutor) {
        this.titulo = titulo;
        this.tutor = tutor;
    }

    void mostrarCurso(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Tutor: " + this.tutor);
    }

    static void main(String[] args) {
        Curso curso1 = new Curso("Programacion Orientada a Objetos", "Jhon Carlos Arrieta");
        curso1.mostrarCurso();
        Curso curso2 = new Curso("Calculo Diferencia", "Atilano Arrieta");
        curso2.mostrarCurso();
    }

    //curso1 y curso2 son objetos diferentes porque: la clase Curso es como si fuera el molde para crear galletas, curso1 es una galleta creada a partir de ese molde, y curso2 es otra galleta creada a partir del mismo molde. Ambas son galletas separadas, independientes una de la otra.

}
