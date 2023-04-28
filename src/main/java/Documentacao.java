public class Documentacao extends RH {
    private static Documentacao documentacao = new Documentacao();
    private Documentacao() {};

    public static Documentacao getInstance() {
        return documentacao;
    }
}
