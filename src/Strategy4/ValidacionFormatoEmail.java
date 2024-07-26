package Strategy4;

public class ValidacionFormatoEmail implements ValidacionStrategy {
    @Override
    public boolean validar(String dato) {
        return dato != null && dato.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
