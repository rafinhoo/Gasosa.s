import java.time.LocalDateTime;

public class NotaFiscal{
  private int numFiscal;
  private LocalDateTime dataEmissao;
  private double valorPago;
  private Pagamento pagamento;

  public NotaFiscal(int numFiscal, LocalDateTime dataEmissao, double valorPago, Pagamento pagamento){
    this.numFiscal = numFiscal;
    this.dataEmissao = dataEmissao;
    this.valorPago = valorPago;
    this.pagamento = pagamento;
  }
  public int getNumFiscal(){
    return numFiscal;
  }
  public LocalDateTime getDataEmissao(){
    return dataEmissao;
  }
  public double getValorPago(){
    return valorPago;
  }
  public Pagamento getPagamento(){
    return pagamento;
  }
  public void setPagamento(Pagamento pagamento){
    this.pagamento = pagamento;
  }
}