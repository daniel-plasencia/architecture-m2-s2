package pe.edu.codigo.poo.interfaces;

public class CuentaBancaria implements ServicioBancarioATM, ServicioBancarioInternet {

    private String nroCuenta;
    private String titular;
    private double saldo;

    @Override
    public boolean pagoServicios(String servicio, double monto) {
        return false;
    }

    @Override
    public boolean pagoDiferidoServicios(String servicio, double monto) {
        return false;
    }
}
