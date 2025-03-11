package arraylist.banco;

import java.util.Scanner;

public class DemoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato extrato = new Extrato();
        int opcao;
        float valor;
        boolean terminar = false;

    do {
        System.out.println("0 - depositar");
        System.out.println("1 - sacar");
        System.out.println("2 - ver extrato");
        System.out.println("3 - encerrar");
        System.out.println("Opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 0: // deposito
                System.out.println("Valor: ");
                valor = sc.nextFloat();
                extrato.transacao(valor);
                break;
            case 1: // sacar
                System.out.println("Valor: ");
                valor = sc.nextFloat();
                extrato.transacao(-valor);
                break;
            case 2: // ver extrato
                extrato.verExtrato();;
                break;
            default:
                 System.out.println("Encerrando a sessao");
                 terminar = true;
                break;
        }
    }while (!terminar);
            
        sc.close();
    }
}
