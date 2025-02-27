package classes.Lista.q01;

public class Time {
    String nomeDoTime;
    int posicaoNaTabela;
    int vitorias;
    int derotas;
    int empates;
    int jogosEmCasa;
    int jogosForaDeCasa;

    Time(String nomeDoTime, int posicaoNaTabela, int vitorias, int derotas, int empates, int jogosEmCasa, int jogosForaDeCasa){
        
        this.nomeDoTime = nomeDoTime;
        this.posicaoNaTabela = posicaoNaTabela;
        this.vitorias = vitorias;
        this.derotas = derotas;
        this.empates = empates;
        this.jogosEmCasa = jogosEmCasa;
        this.jogosForaDeCasa = jogosForaDeCasa;
    }

    void mostraTime(){
        System.out.println("Time: " + nomeDoTime);
        System.out.println("Posição na Tabela: " + posicaoNaTabela + "º");
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derotas: " + derotas);
        System.out.println("Empates: " + empates);
        System.out.println("Jogos em casa: " + jogosEmCasa);
        System.out.println("Jogos fora de casa: " + jogosForaDeCasa);
        System.out.println("");
    }

}
