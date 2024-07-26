package Strategy4;

public class ValidacionContraseñaSegura implements ValidacionStrategy {
    @Override
    public boolean validar(String dato) {
        return dato != null && dato.length() >= 8 && dato.matches(".*[A-Z].*") && dato.matches(".*[0-9].*");
    }
}
