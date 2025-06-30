public abstract class Combustivel {
    private String tipo;
    private double litrosDisponivel;

  
    public Combustivel(String tipo, double litrosDisponivel) {
        this.tipo = tipo;
        this.litrosDisponivel = litrosDisponivel;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLitrosDisponivel() {
        return litrosDisponivel;
    }

    public void setLitrosDisponivel(double litrosDisponivel) {
        this.litrosDisponivel = litrosDisponivel;
    }

    
    public void abastecendoVeiculo(double qtdAbastecida) {
        if (qtdAbastecida <= litrosDisponivel) {
            litrosDisponivel -= qtdAbastecida;
            System.out.println("Abastecido " + qtdAbastecida + " litros de " + tipo);
        } else {
            System.out.println("Estoque insuficiente para abastecer " + qtdAbastecida + " litros.");
        }
    }

    
    public void reabastecendoEstoque(double litrosRepostos) {
        litrosDisponivel += litrosRepostos;
        System.out.println("Reabastecido com " + litrosRepostos + " litros de " + tipo);
    }
}


