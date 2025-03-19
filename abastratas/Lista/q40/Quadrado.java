package abastratas.Lista.q40;

public class Quadrado extends FiguraGeometrica{
    private int lados;

    public Quadrado(int lados) {
        this.lados = lados;
    }
    
    public void descricao() {
        System.out.println("O quadrado tem " + lados + " lados.");
    }
}
