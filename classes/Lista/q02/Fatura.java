package classes.Lista.q02;

public class Fatura {
    int id;
    String desc;
    int quantidade;
    double preco;
    double total;

    Fatura(int id, String desc, int quantidade, double preco) {
        
        this.id = id;
        this.desc = desc;
        if (quantidade < 0) {
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }
        if (preco < 0) {
            this.preco = 0.0;
        }else{
            this.preco = preco;
        }

    }

    double calculaTotal(){
        total = quantidade * preco;
        return total;
    }

    void mostraFatura(){
        System.out.println("    FATURA      ");
        System.out.println("Id do produto: " + id);
        System.out.println("Descrição do produto: " + desc);
        System.out.println("Quantidade comprada: " + quantidade);
        System.out.println("Preço: " + preco);
        System.out.println("TOTAL: " + total);
    }

}
