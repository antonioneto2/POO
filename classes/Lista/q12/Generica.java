package classes.Lista.q12;

public class Generica<A>  {
    private A pri;
    private A seg;
    private A ter;
   
    public Generica(A pri, A seg, A ter) {
        this.pri = pri;
        this.seg = seg;
        this.ter = ter;
    }
    
    public int compara() { 
        if (pri == seg && seg == ter) {
            return 3;
        }if (pri != seg && seg != ter) {
            return 0;
        }else{ 
            return 2;
        }
    }

    public String toString(){ 
        return ("Primeiro: " + pri + " Segundo: " + seg + " Terceiro: " + ter );
    }
}
