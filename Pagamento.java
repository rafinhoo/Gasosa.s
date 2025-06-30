import java.time.LocalDateTime;

public class Pagamento {
  private int id;
  private double valorOriginal;
  private double desconto;
  private double valorPago;
  private String status;
  private FormaPagamento formaPagamento;
  private LocalDateTime dataPagamento;

  public Pagamento(int id, double valorOriginal, String status, FormaPagamento formaPagamento, LocalDateTime dataPagamento){
    this.id = id;
    this.valorOriginal = valorOriginal;
    this.desconto = 0;
    this.valorPago = valorOriginal;
    setStatus(status);
    this.formaPagamento = formaPagamento;
    this.dataPagamento = dataPagamento;
    aplicarDesconto();
  }
  private void aplicarDesconto(){
    if(formaPagamento == FormaPagamento.DINHEIRO || formaPagamento == FormaPagamento.PIX){
      desconto = valorOriginal * 0.05;
      valorPago = valorOriginal - desconto;
    }else{
      desconto = 0;
      valorPago = valorOriginal;
    }
  }
  public boolean validarPagamento(){
    return valorPago > 0 && "APROVADO".equals(status);
  }
  public int getId(){
    return id;
  }
  public double getValorOriginal(){
    return valorOriginal;
  }
  public double getDesconto(){
    return desconto;
  }
  public double getValorPago(){
    return valorPago;
  }
  public String getStatus(){
    return status;
  }
  public void setStatus(String status){
    if (status != null){
      this.status = status.toUpperCase();
    }else{
      this.status = null;
    }
  }
  public FormaPagamento getFormaPagamento(){
    return formaPagamento;
  }
  public void setFormaPagamento(FormaPagamento formaPagamento){
    this.formaPagamento = formaPagamento;
    aplicarDesconto();
  }
  public LocalDateTime getDataPagamento(){
    return dataPagamento;
  }
  public void setDataPagamento(LocalDateTime dataPagamento){
    this.dataPagamento = dataPagamento;
  }
}