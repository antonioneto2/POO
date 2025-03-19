package abastratas.Lista.q40;

public class DemoFiguraGeometrica {
    public static void main(String[] args) {
        Circulo circ = new Circulo(3.5F);
        Quadrado qua = new Quadrado(4);
        Triangulo tri = new Triangulo("Retangulo");

        circ.descricao();
        qua.descricao();
        tri.descricao();
    }
}
