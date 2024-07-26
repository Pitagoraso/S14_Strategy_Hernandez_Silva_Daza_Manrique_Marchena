package Strategy3;

public class Main {
    public static void main(String[] args) {
        CompresionStrategy zip = new CompresionZIP();
        CompresionStrategy rar = new CompresionRAR();
        CompresionStrategy gzip = new CompresionGZIP();

        CompresorDeArchivos compresorConZIP = new CompresorDeArchivos(zip);
        compresorConZIP.comprimirArchivo("archivo1.txt");

        CompresorDeArchivos compresorConRAR = new CompresorDeArchivos(rar);
        compresorConRAR.comprimirArchivo("archivo2.txt");

        CompresorDeArchivos compresorConGZIP = new CompresorDeArchivos(gzip);
        compresorConGZIP.comprimirArchivo("archivo3.txt");
    }
}
