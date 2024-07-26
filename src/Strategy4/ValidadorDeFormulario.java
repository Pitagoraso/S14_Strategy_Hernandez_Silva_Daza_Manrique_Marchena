package Strategy4;

public class ValidadorDeFormulario {
    private ValidacionStrategy estrategia;

    public ValidadorDeFormulario(ValidacionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public boolean validarCampo(String dato) {
        return estrategia.validar(dato);
    }
}
