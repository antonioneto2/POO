package abastratas.Lista.q40;

public class Circulo extends FiguraGeometrica {
    private float diametro;


    public Circulo(float diametro) {
        this.diametro = diametro;
    }


    public void descricao() {
        System.out.println("Diametro do circulo: " + diametro);
    }
}
