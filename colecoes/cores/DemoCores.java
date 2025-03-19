package colecoes.cores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>(Arrays.asList("rosa", "laranja", "roxo"));
        cores.add("azul");
        cores.add("branco");
        String[] novasCores = {"preto", "cinza", "verde"};
        cores.addAll(Arrays.asList(novasCores));
        System.out.println(cores);
        Collections.sort(cores);
        System.out.println(cores);
        buscaAlvo(cores, "branco");
        buscaAlvo(cores, "marrom");
    }

    public static void buscaAlvo(ArrayList<String> list, String alvo) {
        if (list.contains(alvo)) {
            int posicao = Collections.binarySearch(list, alvo);
            System.out.println(alvo + " estah na posicao " + posicao + " da lista");
        }else{
            System.out.println(alvo + " nao estah na lista");
         
        }
    }
}
