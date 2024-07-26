package Strategy1;

public class DescuentoPromocional implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.getPrecio() * 0.80; // 20% de descuento
    }
}
