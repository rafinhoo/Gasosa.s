import java.util.ArrayList;

public class HistoricoVenda{
  private String periodo;
  private double totalVendido;
  private ArrayList<NotaFiscal> notasFiscais;

  public HistoricoVenda(String periodo){
    this.periodo = periodo;
    this.notasFiscais = new ArrayList<NotaFiscal>();
    this.totalVendido = 0;
  }
  public void registrarPagamento(Pagamento pagamento){
    if(pagamento.validarPagamento()){
      NotaFiscal nota = gerarNotaFiscal(pagamento);
      adicionarNota(nota);
      System.out.println("Pagamento feito e nota gerada!");
    }else{
      System.out.println("Pagamento inválido. Não registrado!");
    }
  }
  private NotaFiscal gerarNotaFiscal(Pagamento pagamento){
    int numNota = notasFiscais.size() + 1;
    return new NotaFiscal(numNota, pagamento.getDataPagamento(), pagamento.getValorPago(), pagamento);
  }
  private void adicionarNota(NotaFiscal nota){
    if(nota != null){
      notasFiscais.add(nota);
      totalVendido += nota.getValorPago();
    }
  }
  public void gerarHistorico(){
    System.out.println("============= Histórico de Vendas =============");
    System.out.println("Total de vendas: R$ " + totalVendido);
    System.out.println("Quantidade de notas: " + notasFiscais.size());
    System.out.println("===============================================");

    for(NotaFiscal nota : notasFiscais){
      System.out.println("Nota de número: " + nota.getNumFiscal());
      System.out.println("Data de emissão: " + nota.getDataEmissao());
      System.out.println("Valor : R$ " + nota.getValorPago());
      System.out.println("Tipo de pagamento: " + nota.getPagamento().getFormaPagamento());
      System.out.println("Status da nota: " + nota.getPagamento().getStatus());
      System.out.println("==============================================");
    }
  }

  public String getPeriodo(){
    return periodo;
  }
  public double getTotalVendido(){
    return totalVendido;
  }
  public ArrayList<NotaFiscal> getNotasFiscais(){
    return notasFiscais;
  }
}