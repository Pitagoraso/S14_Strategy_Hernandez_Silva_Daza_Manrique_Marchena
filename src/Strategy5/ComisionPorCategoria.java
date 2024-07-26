package Strategy5;

public class ComisionPorCategoria implements CalculoComisionStrategy {
    @Override
    public double calcularComision(double ventas) {
        return ventas * 0.15; // 15% de comision por categoria de producto
    }
}
