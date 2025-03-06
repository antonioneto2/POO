package classes.Lista.q09;

public class Complexo {
    float real;
    float imaginario;
    
    public Complexo(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo(float real){
        this.real = real;
        this.imaginario = 0.0F;
    }

    public Complexo(){
        this.real = 0.0F;
        this.imaginario= 0.0F;
    }

    public String toString(){
        return (real + " + " + imaginario + "i");
    }
    
}
