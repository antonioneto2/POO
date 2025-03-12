package arraylist.Lista.q18;

public class Matriz {
    private static final int linhas = 2;
    private static final int colunas = 2;
    private float[][] matriz;

    public Matriz() {
        matriz = new float[linhas][colunas];
        float valor = 2.0F;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                matriz[l][c] = valor;
                valor = valor + 2;
            }
        }
    }

    public float calculaDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public String toString(){
        String rep = "";
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                rep += matriz[l][c] + "  ";
            }
            rep += "\n";
        }
        return rep;
    }
}
