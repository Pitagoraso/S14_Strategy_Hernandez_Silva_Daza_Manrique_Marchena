package Strategy3;

public class CompresionZIP implements CompresionStrategy {
    @Override
    public void comprimir(String archivo) {
        System.out.println("Archivo " + archivo + " comprimido usando ZIP.");
    }
}
