package abastratas.controleUniversal;

public class Controle {
    public void controlar(Aviao aviao) {
        aviao.moverFrente();
    }

    public void controlar(Carro carro) {
        carro.moverFrente();
    }

    public void controlar(Barco barco) {
        barco.moverFrente();
    }
}
