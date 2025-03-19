package abastratas.Lista.q40;

public class Triangulo extends FiguraGeometrica{
    private String tipo;

    public Triangulo(String tipo) {
        this.tipo = tipo;
    }
    public void descricao() {
        System.out.println("Tipo do triangulo: " + tipo);
    }
}
