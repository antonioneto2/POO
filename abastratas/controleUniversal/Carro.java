package abastratas.controleUniversal;

public class Carro {
    private int capacidade;
    private int qtdRodas;
    private String placa;
    
    public Carro(int capacidade, int qtdRodas, String placa) {
        this.capacidade = capacidade;
        this.qtdRodas = qtdRodas;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro [capacidade=" + capacidade + ", qtdRodas=" + qtdRodas + ", placa=" + placa + "]";
    }    
}
