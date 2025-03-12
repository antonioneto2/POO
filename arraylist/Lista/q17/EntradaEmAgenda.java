package arraylist.Lista.q17;

public class EntradaEmAgenda {
    private int dia, mes, ano, hora;
    private String assunto;
    
    public EntradaEmAgenda(int dia, int mes, int ano, int hora, String assunto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.assunto = assunto;
    }
    
    public String toString() {
        return hora + " hora(s) " + "\n" + dia + "/" + mes + "/" + ano + "\n" + assunto;
    }

    
    
}
