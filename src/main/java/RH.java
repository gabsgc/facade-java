import java.util.ArrayList;
import java.util.List;

public class RH {
    private List<Funcionario> funcionariosComPendencia = new ArrayList<Funcionario>();

    public void addFuncionarioComPendencia(Funcionario funcionario) {
        this.funcionariosComPendencia.add(funcionario);
    }

    public boolean verificarPendencia(Funcionario funcionario) {
        return this.funcionariosComPendencia.contains(funcionario);
    }
}
