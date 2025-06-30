import java.util.ArrayList;
import java.util.List;

public class Conveniencia {
    private String nome;
    private String cnpj;
    private List<Produto> produtos = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();

    public Conveniencia(String nome, String cnpj, List<Produto> produtos, List<Venda> vendas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = produtos;
        this.vendas = vendas;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }

    public List<Venda> getVendas() { return vendas; }
    public void setVendas(List<Venda> vendas) { this.vendas = vendas; }

    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }

    public String buscarProdutoPorNome(String nome){
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto.getNome() + " - R$ " + produto.getPreco();
            }
        }
        return "Produto não encontrado";
    }

    public void registrarVenda(Venda venda){
        vendas.add(venda);
    }

    public void listarVendas(){
        for (Venda venda : vendas){
            System.out.println("ID: " + venda.getIdVenda() + " - Data: " + venda.getDataVenda() + " - Total: R$ " + venda.getTotalVenda());
        }
    }

    public double calcularfaturamentoTotal(){
        double faturamentoTotal = 0;
        for (Venda venda : vendas){
            faturamentoTotal += venda.getTotalVenda();
        }
        return faturamentoTotal;
    }
}