package actividad_aprendizaje;

public class Rectangulo {

    public static int area(int lado, int altura){
        return lado*altura;
    }

    public static int perimetro(int lado, int altura){
        return lado*2 + altura*2;
    }

    public static void mostrarResultados() {
        System.out.println("Area del rectangulo: "+area(2,6));
        System.out.println("Perimetro del rectangulo: "+perimetro(2,6));
    }

    static void main(String[] args) {
        mostrarResultados();
    }
}
