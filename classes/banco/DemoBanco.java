package classes.banco;

import java.util.Scanner;

public class DemoBanco {
    public static void main(String[] args) {
        String nome;
        float saldo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Saldo: ");
        saldo = sc.nextFloat();
        sc.close();

        ContaBancaria c1 = new ContaBancaria(nome);
        System.out.println(c1);
        ContaBancaria c2 = new ContaBancaria(nome, saldo, true);
        System.out.println(c2);
    }
}
