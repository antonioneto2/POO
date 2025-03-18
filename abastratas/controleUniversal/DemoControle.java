package abastratas.controleUniversal;

public class DemoControle {
    public static void main(String[] args) {
        Barco barco = new Barco(10, 5.89F, "0ka098");
        Carro carro = new Carro(5, 4, "NKP7475");
        Aviao aviao = new Aviao(42, "oj0987", "qwr-podr");
        System.out.println(barco);
        barco.moverFrente();
        System.out.println(carro);
        carro.moverFrente();
        System.out.println(aviao);
        aviao.moverFrente();
}   
}
