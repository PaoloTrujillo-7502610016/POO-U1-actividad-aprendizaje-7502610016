package actividad_aprendizaje;

public class LecturaYComprension { //46: Se omite el nombre de la clase
    private String soyAtributo1;

    public  LecturaYComprension(String soyAtributo1){
        this.soyAtributo1=soyAtributo1;

    }

    //48:Confusion de atributos con variables locales:
    void asignarValor(String soyAtributo1 /**parametro del metodo**/){

        soyAtributo1 = soyAtributo1;/**referencia al parametro**/
        System.out.println(soyAtributo1);
        //this.soyAtributo1=soyAtributo1;/**referencia al atributo**/
        //System.out.println(soyAtributo1);
    }

    void mostrarObjeto(){
        System.out.println("\nSoy objeto "+this.soyAtributo1);
    }

    public static void main(String[] args) {


        LecturaYComprension objeto1 = new LecturaYComprension("1 y soy valor del atributo");
        objeto1.mostrarObjeto();

        //48:Confusion de atributos con variables locales:
        objeto1.asignarValor("\nSoy valor de la variable local del metodo");

        LecturaYComprension objeto2 = new LecturaYComprension("2 y soy valor del atributo");
        objeto2.mostrarObjeto();//45:metodo dentro de la clase


        //47:uso de objeto sin haberse creado:
        //LecturaYComprension objeto3 = new LecturaYComprension("3 y soy valor del atributo");
       // objeto3.mostrarObjeto();

    }
}
//objeto2.mostrarObjeto();  //45: metodo fuera de la clase
