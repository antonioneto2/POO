package classes.Lista.q02;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura fat = new Fatura(212, "Batería",1000, 27);
        fat.calculaTotal();
        fat.mostraFatura();
        
    }
}
