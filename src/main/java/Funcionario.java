public class Funcionario {
    public boolean consultarPermissaoTrabalho() {
        return FuncionarioFacade.verificarPendenciasFuncionario(this);
    }
}
