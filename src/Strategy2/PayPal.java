package Strategy2;

public class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " procesado con PayPal.");
    }
}
