public class FuncionarioFacade {

    public static boolean verificarPendenciasFuncionario(Funcionario funcionario) {
        if (Documentacao.getInstance().verificarPendencia(funcionario)) {
            return false;
        }
        if (Ambulatorio.getInstance().verificarPendencia(funcionario)) {
            return false;
        }
        if (Seguranca.getInstance().verificarPendencia(funcionario)) {
            return false;
        }
        return true;
    }
}
