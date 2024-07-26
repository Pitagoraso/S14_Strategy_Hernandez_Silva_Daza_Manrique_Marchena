package Strategy4;

public class Main {
    public static void main(String[] args) {
        ValidacionStrategy campoObligatorio = new ValidacionCampoObligatorio();
        ValidacionStrategy formatoEmail = new ValidacionFormatoEmail();
        ValidacionStrategy contraseñaSegura = new ValidacionContraseñaSegura();

        ValidadorDeFormulario validador1 = new ValidadorDeFormulario(campoObligatorio);
        System.out.println("Campo obligatorio: " + validador1.validarCampo(""));

        ValidadorDeFormulario validador2 = new ValidadorDeFormulario(formatoEmail);
        System.out.println("Formato email: " + validador2.validarCampo("test@example.com"));

        ValidadorDeFormulario validador3 = new ValidadorDeFormulario(contraseñaSegura);
        System.out.println("Contraseña segura: " + validador3.validarCampo("Pass1234"));
    }
}
