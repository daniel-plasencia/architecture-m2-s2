package pe.edu.codigo.poo.pattern.ioc;

public class MensajeEs implements Mensaje {

    private String nombre;

    @Override
    public void procesarMsg() {
        System.out.println("Buen dia, "+this.nombre);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
