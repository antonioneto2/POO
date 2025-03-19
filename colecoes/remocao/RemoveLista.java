package colecoes.remocao;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveLista {
    public static void main(String[] args) {
        LinkedList<String> listaCompleta = new LinkedList<>();
        LinkedList<String> listaRemocao = new LinkedList<>();
        listaCompleta.add("verde");
        listaCompleta.add("azul");
        listaCompleta.add("amarelo");
        listaCompleta.add("roxo");
        listaCompleta.add("preto");
        listaCompleta.add("branco");
        listaCompleta.add("laranja");
        listaRemocao.add("amarelo");
        listaRemocao.add("roxo");
        listaRemocao.add("branco");
        System.out.println("Lista completa:");
        System.out.println(listaCompleta);
        System.out.println("Lista remocao: ");
        System.out.println(listaRemocao);
        removeLista(listaCompleta, listaRemocao);
    }

    public static void removeLista(LinkedList<String> listaCompleta, LinkedList<String> listaRemocao){
        ListIterator<String> itera = listaCompleta.listIterator();
        
        while (itera.hasNext()) {
            String elemento = itera.next();
            if (listaRemocao.contains(elemento)) {
                itera.remove();
                System.out.println(elemento + " removido");
            }
        }
    }
}
