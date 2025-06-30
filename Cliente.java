import java.time.LocalDate;

public class Cliente extends Pessoa {
    private int pontoFidelidade;
    private LocalDate dataCadastro;

    public int getPontoFidelidade() {
        return pontoFidelidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public Cliente(String nome, int idade, String email, String cpf, String telefone, LocalDate dataCadastro) {
        super(nome, idade, email, cpf, telefone);
        this.pontoFidelidade = 0;
        this.dataCadastro = dataCadastro;
    }

    public void juntarPontos(int pontos) {
        if (pontos > 0) {
            this.pontoFidelidade += pontos;
        }
    }

    public void resgatarPontos (int pontos) {
        if (pontos > 0 && pontos <= pontoFidelidade) {
            this.pontoFidelidade -= pontos;
        }
        else {
            System.out.println("Pontos insuficientes, acumule mais para recorrer a premios");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPontos de Fidelidade: " + pontoFidelidade +
                "\nData de Cadastro: " + dataCadastro;
    }
}
