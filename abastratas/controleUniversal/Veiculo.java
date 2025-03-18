package abastratas.controleUniversal;

public class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Veiculo [capacidade=" + capacidade + "]";
    }
}
