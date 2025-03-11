package arraylist.dama;

public class JogoDeDama {
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;
    private char[][] tabuleiro;
    
    public JogoDeDama(){
        tabuleiro = new char[LINHAS][COLUNAS];
        for (int l = 0; l < tabuleiro.length; l++) {
            for(int c =0; c < tabuleiro[l].length; c++){
                tabuleiro[l][c] = '.';
            }
        }
    }

    public String toString(){
        String rep = "";
        for (int l = 0; l < tabuleiro.length; l++) {
            for(int c =0; c < tabuleiro[l].length; c++){
                rep += tabuleiro[l][c];
            }
        }
        return rep;
    }
}
