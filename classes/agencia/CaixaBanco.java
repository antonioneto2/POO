package classes.agencia;

public class CaixaBanco {
    public static int clientesAntendidos = 0;
    private int numeroCaixa;
    
    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        clientesAntendidos++;
        System.out.println("Caixa " + numeroCaixa + " atendeu o cliente " + clientesAntendidos);
    }    
}
