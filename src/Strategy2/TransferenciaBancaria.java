package Strategy2;

public class TransferenciaBancaria implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " procesado con Transferencia Bancaria.");
    }
}