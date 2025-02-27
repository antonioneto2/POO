package classes.Lista.q03;

public class AlunosUfersa {
    int matricula;
    String nome;
    double p1, p2, t;

    public AlunosUfersa(int matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public double media(){
        return (2.5 * p1 + 2.5 * p2 + 2 * t) / 7;
    }
    
    public double provaFinal() {
    double mp = media();
    if (mp < 3 || mp >= 7) {
           return 0;
       }
       return (5 * 10 - mp * 6) / 4;
    }
            

}   
