package classes.Lista.q06;

public class Elevador {
    private int numeroAndar;
    private int totalAndares;
    private int qtdMaxElevardor;
    private static int qtdAtualElevador = 0;
    
    public Elevador(int totalAndares, int qtdMaxElevardor) {
        this.totalAndares = totalAndares;
        this.qtdMaxElevardor = qtdMaxElevardor;
    }

    public void entra(){
        if (qtdAtualElevador < qtdMaxElevardor) {
            qtdAtualElevador++;
            System.out.println("Uma pessoa entrou. " + qtdAtualElevador + "/" + qtdMaxElevardor);
        }else{
            System.out.println("Elevador está lotado.");
        }
    }

    public void sai(){
        if (qtdAtualElevador > 0) {
            qtdAtualElevador--;
            System.out.println("Uma pessoa saiu." + qtdAtualElevador + "/" + qtdMaxElevardor );
        }else{
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe(){
        if (numeroAndar < totalAndares) {
            numeroAndar++;
            System.out.println("Você foi para o " + numeroAndar +"º andar.");
        }else{
            System.out.println("Você está no último andar.");
        }
    }

    public void desce(){
        if (numeroAndar > 0) {
            numeroAndar--;
            System.out.println("Você está no " + numeroAndar + "º andar.");
        }else{
            System.out.println("Você está no terreo.");
        }
    }

}
