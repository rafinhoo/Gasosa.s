import java.time.LocalDate;


public class Venda {
  
  private int idVenda;
  private LocalDate dataVenda;
  private double totalVenda;

  public Venda(int idVenda, LocalDate dataVenda, double totalVenda){
    this.idVenda = idVenda;
    this.dataVenda = dataVenda;
    this.totalVenda = totalVenda;
  }

  public int getIdVenda(){
    return idVenda;
  }
  public void setIdVenda(int idVenda){
    this.idVenda = idVenda;
  }
  public LocalDate getDataVenda(){
    return dataVenda;
  }
  public void setDataVenda(LocalDate dataVenda){
    this.dataVenda = dataVenda;
  }
  public double getTotalVenda(){
    return totalVenda;
  }
  public void setTotalVenda(double totalVenda){
    this.totalVenda = totalVenda;
  }

  public void adicionarItem(ItemVenda item){
    totalVenda += item.calcularSubtotal();
  }

  public double calcularTotalVenda(){
    return totalVenda;
  }

  public void finalizarVenda(){
    System.out.println("Venda finalizada. Total: " + totalVenda);
  }

  
}