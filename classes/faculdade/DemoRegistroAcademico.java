package classes.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael; 
        michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "123456", 2, 0.6F);
        float mensal = michael.calculaMensalidade();
        System.out.println("Mensalidade = " + mensal);
        RegistroAcademico roberto = new RegistroAcademico();
        System.out.println("Mens. Roberto: " + roberto.calculaMensalidade());
    }
}
