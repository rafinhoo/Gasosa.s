import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, String email, String cpf, String telefone,
                   String matricula, String cargo, double salario, String turno) {
        super(nome, idade, email, cpf, telefone, matricula, cargo, salario, turno);
    }

    public void gerarRelatorios(List<Venda> vendas) {
        for (Venda v : vendas) {
            System.out.println(v);
        }
    }

    public void demitirFuncionario(Funcionario funcionario) {
        System.out.println("Funcionário " + funcionario.getNome() + " demitido.");
    }

    public void gerenciarPontos(List<PontoFuncionario> pontos) {
        for (PontoFuncionario ponto : pontos) {
            System.out.println("Data: " + ponto.getData() + " | Total de horas: " + ponto.getTotalHoras());
        }
    }

    public void gerenciarEstoque(List<Produto> produtos) {
        for (Produto p : produtos) {
            System.out.println(p.getNome() + p.getQuantidadeEstoque() + "unidades");
        }
    }

    public void visualizarVendas(List<Venda> vendas) {
        for (Venda v : vendas) {
            System.out.println(v);
        }
    }
}
