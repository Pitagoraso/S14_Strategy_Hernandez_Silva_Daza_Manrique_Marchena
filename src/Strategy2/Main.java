package Strategy2;

public class Main {
    public static void main(String[] args) {
        MetodoPago tarjetaCredito = new TarjetaCredito();
        MetodoPago paypal = new PayPal();
        MetodoPago transferenciaBancaria = new TransferenciaBancaria();

        ProcesadorDePagos procesadorConTarjeta = new ProcesadorDePagos(tarjetaCredito);
        procesadorConTarjeta.realizarPago(150.0);

        ProcesadorDePagos procesadorConPayPal = new ProcesadorDePagos(paypal);
        procesadorConPayPal.realizarPago(250.0);

        ProcesadorDePagos procesadorConTransferencia = new ProcesadorDePagos(transferenciaBancaria);
        procesadorConTransferencia.realizarPago(300.0);
    }
}
