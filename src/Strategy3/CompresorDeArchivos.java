package Strategy3;

public class CompresorDeArchivos {
    private CompresionStrategy estrategia;

    public CompresorDeArchivos(CompresionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void comprimirArchivo(String archivo) {
        estrategia.comprimir(archivo);
    }
}
