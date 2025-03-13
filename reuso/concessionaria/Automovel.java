package reuso.concessionaria;

public class Automovel {
    private int ano;
    private String modelo;
    private String cor;
    
    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public float quantoCusta() {
        return (ano < 2010 ? 60000F : 90000F);
    }

}
