package pe.edu.codigo.poo.pattern.ioc;

public class Aplicacion {

    //private Mensaje msg;

    public static void main(String[] args){
        Mensaje mensaje = new MensajeEn();
        mensaje.setNombre("Daniel");
        procesar(mensaje);
    }

    // La logica de la aplicacion principal, no la ejecuta la aplicación principal
    // sino, la clase que estás inyectando
    // En SpringBoot la inicializacion de la clase, es hecha en runtime


    public static void procesar(Mensaje msg){
        msg.procesarMsg();
    }


}
