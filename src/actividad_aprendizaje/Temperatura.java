package actividad_aprendizaje;

public class Temperatura {
    int gradoCelcius;


    public Temperatura(int gradoCelcius){
        this.gradoCelcius = gradoCelcius;
    }

    double convertirFarenheit(){
        return gradoCelcius * 9/5 + 32;
    }

    static void main(String[] args) {
        Temperatura temperatura = new Temperatura(5);
        System.out.println("Temperatura en grados celcius: "+temperatura.gradoCelcius+"°");
        System.out.println("Temperatura en grados Farenheit: "+temperatura.convertirFarenheit()+"°");
    }

}
