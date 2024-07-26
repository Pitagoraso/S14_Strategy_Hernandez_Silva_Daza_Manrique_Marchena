package Strategy5;

public class ComisionPorDesempeno implements CalculoComisionStrategy {
    @Override
    public double calcularComision(double ventas) {
        return ventas * 0.20; // 20% de comision por buen desempeno
    }
}
