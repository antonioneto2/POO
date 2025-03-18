package abastratas.controleUniversal;

public class Aviao {
    private int capacidade;
    private String cadANAC;
    private String cadAviao;
    
    public Aviao(int capacidade, String cadANAC, String cadAviao) {
        this.capacidade = capacidade;
        this.cadANAC = cadANAC;
        this.cadAviao = cadAviao;
    }

    public void moverFrente() { 
        System.out.println("Aviao movendo para frente");
    }

    @Override
    public String toString() {
        return "capacidade=" + capacidade + ", cadANAC=" + cadANAC + ", cadAviao=" + cadAviao;
    }

    
}
