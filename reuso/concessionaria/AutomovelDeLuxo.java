package reuso.concessionaria;

public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;
    
    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado,
            boolean direcaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public float quantoCusta() {
        float custo = super.quantoCusta();
        if (arCondicionado) custo += 15000;
        if (direcaoHidraulica) custo += 17000;
        return custo;
    }
    
}
