package Strategy3;

public class CompresionRAR implements CompresionStrategy {
    @Override
    public void comprimir(String archivo) {
        System.out.println("Archivo " + archivo + " comprimido usando RAR.");
    }
}
