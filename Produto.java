public abstract class Produto {
    private int id;
    private String nomeProduto;
    private double preco;
    private int qtdEstoque;


    public produto (int id, String nomeProduto,double preco,int qtdEstoque){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }


    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getQtdEstoque() {
        return qtdEstoque;
    }


    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void entradaProduto(){
        qtdEstoque += quantidade;
            

     }

    public void saidaProduto() {
        qtdEstoque -= quantidade;

    }   

    public String verificarDisponibilidade (){
        if(estoqueProduto > qtdProduto ){
            return "esse produto esta disponivel";
        }
        else{
            return "esse produto esta em falta no estoque, temos apenas " + qtdEstoque;
        }

    }

}




