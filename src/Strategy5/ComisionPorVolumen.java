package Strategy5;

public class ComisionPorVolumen implements CalculoComisionStrategy {
    @Override
    public double calcularComision(double ventas) {
        return ventas * 0.10; // 10% de comision por volumen de ventas
    }
}
