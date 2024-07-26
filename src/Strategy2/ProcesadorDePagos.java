package Strategy2;

public class ProcesadorDePagos {
    private MetodoPago metodoPago;

    public ProcesadorDePagos(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double cantidad) {
        metodoPago.procesarPago(cantidad);
    }
}
