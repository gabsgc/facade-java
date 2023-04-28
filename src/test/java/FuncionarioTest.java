import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void quandoFuncionarioSemPendencia_deveRetornarTrueParaPermissaoDeTrabalho() {
        Funcionario funcionario = new Funcionario();

        assertTrue(funcionario.consultarPermissaoTrabalho());
    }

    @Test
    void quandoFuncionarioTiverPendenciaAmbulatorio_deveRetornarFalseParaPermissaoDeTrabalho() {
        Funcionario funcionario = new Funcionario();
        Ambulatorio.getInstance().addFuncionarioComPendencia(funcionario);

        assertFalse(funcionario.consultarPermissaoTrabalho());
    }

    @Test
    void quandoFuncionarioTiverPendenciaDocumentacao_deveRetornarFalseParaPermissaoDeTrabalho() {
        Funcionario funcionario = new Funcionario();
        Documentacao.getInstance().addFuncionarioComPendencia(funcionario);

        assertFalse(funcionario.consultarPermissaoTrabalho());
    }

    @Test
    void quandoFuncionarioTiverPendenciaSeguranca_deveRetornarFalseParaPermissaoDeTrabalho() {
        Funcionario funcionario = new Funcionario();
        Seguranca.getInstance().addFuncionarioComPendencia(funcionario);

        assertFalse(funcionario.consultarPermissaoTrabalho());
    }
}