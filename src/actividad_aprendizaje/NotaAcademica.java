package actividad_aprendizaje;

public class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double notaDefinitiva(){
        return (nota1+nota2+nota3)/3;
    }

    static void main(String[] args) {
        NotaAcademica notaAcademica = new NotaAcademica("Programacion",4.5,4.8,4.2);
        notaAcademica.notaDefinitiva();
        System.out.println("Su nota academica del curso "+notaAcademica.asignatura+" es: "+notaAcademica.notaDefinitiva());
    }
}
