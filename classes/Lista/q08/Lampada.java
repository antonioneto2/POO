package classes.Lista.q08;

import classes.Lista.q07.Contador;

public class Lampada {
    private boolean estadoDaLampada;



    public boolean acende(){
        if (estadoDaLampada == false) {
            return true;
        }else{
            return false;   
        }
    }


    public boolean apaga(){
        if (estadoDaLampada == true) {
            return false;
        }else{
            return true;
        }
    }

    public String mostraEstado(){
        return estadoDaLampada ? "Lampada está acesa" : "Lampada está apagada";

    }

    public boolean estaLigada(){
        if (estadoDaLampada == true) {
            return true;
        }else{
            return false;
        }
    }

    public int Contador(){
        Contador contador = new Contador(0);
        contador.incrementarContador();
        return contador.imprimeContador();
    }
}

