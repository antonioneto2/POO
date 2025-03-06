package classes.Lista.q12;

public class DemoGenerica {
    public static void main(String[] args) {
        Generica<Integer> g1 = new Generica<>(2 , 2, 5);
        System.out.println("Iguais: " + g1.compara());
        System.out.println(g1.toString());

    }

}
