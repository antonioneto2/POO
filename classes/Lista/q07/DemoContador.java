package classes.Lista.q07;

public class DemoContador {
    public static void main(String[] args) {
        Contador cont = new Contador(10);
        cont.incrementarContador();
        System.out.println(cont.imprimeContador());
        cont.zerarContador();
        System.out.println(cont.imprimeContador());
    }
}
