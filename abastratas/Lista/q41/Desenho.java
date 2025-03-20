package abastratas.Lista.q41;

import abastratas.Lista.q40.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica fig1;
    private int xfig1;
    private int yfig1;
    private FiguraGeometrica fig2;
    private int xfig2;
    private int yfig2;

    public Desenho(FiguraGeometrica fig1, int xfig1, int yfig1, FiguraGeometrica fig2, int xfig2, int yfig2) {
        this.fig1 = fig1;
        this.xfig1 = xfig1;
        this.yfig1 = yfig1;
        this.fig2 = fig2;
        this.xfig2 = xfig2;
        this.yfig2 = yfig2;
    }

    public void apresenta(){
        System.out.print("Cordenadas: (" + xfig1 + "," + yfig1 + ")\nFigura: ");
        fig1.descricao(); 
        System.out.print("Cordenadas: (" + xfig2 + "," + yfig2 + ")\nFigura: ");
        fig2.descricao(); 
    }
}
