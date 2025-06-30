public abstract class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, int idade, String email, String cpf, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nEmail: " + email +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone;
    }
}
