package arraylist.Lista.q21;

import java.util.Random;

public class SimulaDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencias = new int[13]; // Índices de 2 a 12

        int totalLancamentos = 36_000_000;

        // Simulação dos lançamentos
        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1; // Número entre 1 e 6
            int dado2 = random.nextInt(6) + 1; // Número entre 1 e 6
            int soma = dado1 + dado2;
            frequencias[soma]++; // Incrementa a contagem da soma
        }

        // Exibição dos resultados
        System.out.println("Soma\tFrequência\tPorcentagem");
        for (int soma = 2; soma <= 12; soma++) {
            double porcentagem = (frequencias[soma] / (double) totalLancamentos) * 100;
            System.out.printf("%d\t%d\t\t%.2f%%%n", soma, frequencias[soma], porcentagem);
        }
    }
}
