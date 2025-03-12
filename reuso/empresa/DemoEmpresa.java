package reuso.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Antonio", "202503");
        System.out.println(p);
        Funcionario f = new Funcionario("Neto", "202505", 4568.90F);
        System.out.println(f);
        ChefeDeDepartamento c = new ChefeDeDepartamento("Nogueira", "202500", 20850.64F, "DETEC");
        System.out.println(c);
    }

}
