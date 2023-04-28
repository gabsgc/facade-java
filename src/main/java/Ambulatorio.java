public class Ambulatorio extends RH {
    private static Ambulatorio ambulatorio = new Ambulatorio();

    private Ambulatorio() {};

    public static Ambulatorio getInstance() {
        return ambulatorio;
    }
}
