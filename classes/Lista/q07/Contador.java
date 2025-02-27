package classes.Lista.q07;

public class Contador {
    private int contEventos;

    public Contador(int contEventos) {
        this.contEventos = contEventos;
    }

    public void zerarContador(){
        contEventos = 0;
    }

    public void incrementarContador(){
        contEventos++;
    }

    public int imprimeContador(){
        return contEventos;
    }

}
