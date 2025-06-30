public class Gasolina extends Combustivel {
    private double precoGasolina;

    public Gasolina(double litrosDisponivel, double precoGasolina) {
        super("Gasolina Comum", litrosDisponivel);
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    
}

