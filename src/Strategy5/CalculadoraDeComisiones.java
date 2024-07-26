package Strategy5;

public class CalculadoraDeComisiones {
    private CalculoComisionStrategy estrategia;

    public CalculadoraDeComisiones(CalculoComisionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double ventas) {
        return estrategia.calcularComision(ventas);
    }
}
