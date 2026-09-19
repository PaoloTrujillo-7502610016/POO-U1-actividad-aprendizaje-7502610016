package actividad_aprendizaje;

public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }

    void activar(){
        activo = true;
        System.out.println("Usuario Activo");
    }
    void desactivar(){
        activo = false;
        System.out.println("Usuario Inactivo");
    }

    static void main(String[] args) {
        UsuarioSistema usuario = new UsuarioSistema("Paolo", "123456", true);
        System.out.println("Usuario: "+usuario.nombreUsuario);
        System.out.println("Estado del usuario:");

        int opcion=2;//Se selecciona una opcion
        switch (opcion){
            case 1:usuario.activar();
                break;
            case 2:usuario.desactivar();
                break;
            default:System.out.println("Opción no válida");
        }

    }


}
