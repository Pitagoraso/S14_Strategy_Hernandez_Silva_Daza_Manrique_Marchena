package Strategy5;

public class Main {
    public static void main(String[] args) {
        CalculoComisionStrategy comisionPorVolumen = new ComisionPorVolumen();
        CalculoComisionStrategy comisionPorCategoria = new ComisionPorCategoria();
        CalculoComisionStrategy comisionPorDesempeno = new ComisionPorDesempeno();

        CalculadoraDeComisiones calculadora1 = new CalculadoraDeComisiones(comisionPorVolumen);
        System.out.println("Comision por volumen: $" + calculadora1.calcular(10000));

        CalculadoraDeComisiones calculadora2 = new CalculadoraDeComisiones(comisionPorCategoria);
        System.out.println("Comision por categoria: $" + calculadora2.calcular(10000));

        CalculadoraDeComisiones calculadora3 = new CalculadoraDeComisiones(comisionPorDesempeno);
        System.out.println("Comision por desempeno: $" + calculadora3.calcular(10000));
    }
}
