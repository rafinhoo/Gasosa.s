public class ItemVenda {
  private int qtdItem;
  private double precounitario;
  private double subtotal;

  public ItemVenda(int qtdItem, double precounitario, double subtotal){
    this.qtdItem = qtdItem;
    this.precounitario = precounitario;
    this.subtotal = subtotal;
  }

  public int getQtdItem(){
    return qtdItem;
  }

  public void setQtdItem(int qtdItem){
    this.qtdItem = qtdItem;
  }

  public double getPrecounitario(){
    return precounitario;
  }
  public void setPrecounitario(double precounitario){
    this.precounitario = precounitario;
  }
  
  public double getSubtotal(){
    return subtotal;
  }

  public void setSubtotal(double subtotal){
    this.subtotal = subtotal;
  }

  public double calcularSubtotal(){
    return qtdItem * precounitario;
  }

  
}