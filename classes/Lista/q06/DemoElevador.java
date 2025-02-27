package classes.Lista.q06;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 5);
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.desce();
    }
}
