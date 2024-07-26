package Strategy3;

public class CompresionGZIP implements CompresionStrategy {
    @Override
    public void comprimir(String archivo) {
        System.out.println("Archivo " + archivo + " comprimido usando GZIP.");
    }
}
