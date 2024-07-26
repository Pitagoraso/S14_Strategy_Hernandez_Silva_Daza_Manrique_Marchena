package Strategy1;

public class DescuentoFidelidad implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.getPrecio() * 0.85; // 15% de descuento
    }
}
