public class Seguranca extends RH {
    private static Seguranca credencial = new Seguranca();
    private Seguranca() {};

    public static Seguranca getInstance() {
        return credencial;
    }
}
