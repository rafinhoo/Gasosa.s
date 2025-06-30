import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private double salario;
    private String turno;

    public Funcionario(String nome, int idade, String email, String cpf, String telefone, String matricula, String cargo, double salario, String turno) {
        super(nome, idade, email, cpf, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.turno = turno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void registrarPonto() {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println("Ponto registrado:");
        System.out.println("Data: " + dataAtual);
        System.out.println("Hora: " + horaAtual);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMatrícula: " + matricula +
                "\nCargo: " + cargo +
                "\nSalário: R$" + String.format("%.2f", salario) +
                "\nTurno: " + turno;
    }
}
