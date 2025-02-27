package classes.Lista.q08;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acende();
        System.out.println(lampada.mostraEstado());
        lampada.apaga();
        System.out.println(lampada.mostraEstado());
        System.out.println(lampada.estaLigada());
        System.out.println("Lampada foi acesa " + lampada.Contador()+ " vez");
    }
}
