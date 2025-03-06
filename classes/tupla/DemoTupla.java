package classes.tupla;

public class DemoTupla {
    public static void main(String[] args) {
        Tupla<Double, String> t1 = new Tupla<>(2.3, "TESTE");
        System.out.println("Tupla: " + t1.getPri() + ", " + t1.getSeg());

        Tupla<Character, Integer> t2 = new Tupla<>('A', 4);
        System.out.println("Tupla: " + t2.getPri() + ", " + t2.getSeg());
    }
}
