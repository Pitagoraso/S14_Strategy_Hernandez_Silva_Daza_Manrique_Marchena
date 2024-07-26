package Strategy1;

public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 1000.00);
        Producto smartphone = new Producto("Smartphone", 500.00);
        Producto tablet = new Producto("Tablet", 300.00);

        DescuentoStrategy descuentoEstudiante = new DescuentoEstudiante();
        DescuentoStrategy descuentoFidelidad = new DescuentoFidelidad();
        DescuentoStrategy descuentoPromocional = new DescuentoPromocional();

        CarritoDeCompras carritoEstudiante = new CarritoDeCompras(descuentoEstudiante);
        CarritoDeCompras carritoFidelidad = new CarritoDeCompras(descuentoFidelidad);
        CarritoDeCompras carritoPromocional = new CarritoDeCompras(descuentoPromocional);

        System.out.println("Precios finales con descuento estudiante:");
        System.out.println(laptop + " -> $" + carritoEstudiante.calcularPrecioFinal(laptop));
        System.out.println(smartphone + " -> $" + carritoEstudiante.calcularPrecioFinal(smartphone));
        System.out.println(tablet + " -> $" + carritoEstudiante.calcularPrecioFinal(tablet));

        System.out.println("\nPrecios finales con descuento fidelidad:");
        System.out.println(laptop + " -> $" + carritoFidelidad.calcularPrecioFinal(laptop));
        System.out.println(smartphone + " -> $" + carritoFidelidad.calcularPrecioFinal(smartphone));
        System.out.println(tablet + " -> $" + carritoFidelidad.calcularPrecioFinal(tablet));

        System.out.println("\nPrecios finales con descuento promocional:");
        System.out.println(laptop + " -> $" + carritoPromocional.calcularPrecioFinal(laptop));
        System.out.println(smartphone + " -> $" + carritoPromocional.calcularPrecioFinal(smartphone));
        System.out.println(tablet + " -> $" + carritoPromocional.calcularPrecioFinal(tablet));
    }
}
