package Strategy1;

public class CarritoDeCompras {
    private DescuentoStrategy descuentoStrategy;

    public CarritoDeCompras(DescuentoStrategy descuentoStrategy) {
        this.descuentoStrategy = descuentoStrategy;
    }

    public double calcularPrecioFinal(Producto producto) {
        return descuentoStrategy.aplicarDescuento(producto);
    }
}
