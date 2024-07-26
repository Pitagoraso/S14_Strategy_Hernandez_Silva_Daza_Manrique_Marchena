package Strategy1;

public class DescuentoEstudiante implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto) {
        return producto.getPrecio() * 0.90; // 10% de descuento
    }
}
