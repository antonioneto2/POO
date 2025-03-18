package abastratas.controleUniversal;

public class Barco {
    private int capacidade;
    private float profundidade;
    private String cadBarco;
    
    public Barco(int capacidade, float profundidade, String cadBarco) {
        this.capacidade = capacidade;
        this.profundidade = profundidade;
        this.cadBarco = cadBarco;
    }

    public void moverFrente() {
        System.out.println("Barco movendo para frente");
    }

    @Override
    public String toString() {
        return "capacidade=" + capacidade + ", profundidade=" + profundidade + ", cadBarco=" + cadBarco;
    }
}
