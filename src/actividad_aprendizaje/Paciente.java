package actividad_aprendizaje;

public class Paciente {
    String nombre;
    String sexo;
    int edad;

    public Paciente(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    void mostrarPaciente(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Edad: " + this.edad);
    }

    static void main(String[] args) {
        Paciente paciente1 = new Paciente("Daniela", "Femenino", 28);
        paciente1.mostrarPaciente();
        Paciente paciente2 = new Paciente("Paolo", "Masculino", 30);
        paciente2.mostrarPaciente();
    }
    //crear es la acción,y la instancia es el objeto resultante.
}
