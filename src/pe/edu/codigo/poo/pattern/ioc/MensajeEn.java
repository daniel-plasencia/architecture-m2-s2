package pe.edu.codigo.poo.pattern.ioc;

public class MensajeEn implements Mensaje{

    private String nombre;

    @Override
    public void procesarMsg() {
        System.out.println("Good Morning, "+this.nombre);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
