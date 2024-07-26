package Strategy2;

public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " procesado con Tarjeta de Credito.");
    }
}
