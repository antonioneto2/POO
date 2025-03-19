package abastratas.financeiro;

public class DemoFinanceiro {
    public static void main(String[] args) {
        Assalariado fun = new Assalariado("Antonio", "09184", 2548.00F);
        Fatura fatura = new Fatura(123.45F, 5);

        imprimeCustoPagamento(fun);
        imprimeCustoPagamento(fatura);
    }

    public static void imprimeCustoPagamento(Pagavel pagavel) {
        System.out.println("Valor do pagamento: " + pagavel.obterValorPagamento());
    }
}
