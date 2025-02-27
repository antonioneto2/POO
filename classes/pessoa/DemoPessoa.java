package classes.pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Neto", 1.8F);
        p.setNome("Ana");
        p.setAltura(1.1F);
        System.out.println(p.toString());
    }
}
