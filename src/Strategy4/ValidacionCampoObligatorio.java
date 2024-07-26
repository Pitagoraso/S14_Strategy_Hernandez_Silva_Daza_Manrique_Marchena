package Strategy4;

public class ValidacionCampoObligatorio implements ValidacionStrategy {
    @Override
    public boolean validar(String dato) {
        return dato != null && !dato.trim().isEmpty();
    }
}
