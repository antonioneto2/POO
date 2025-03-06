package classes.igualdade;

public class DemoIgual {

    public static void main(String[] args) {
        if (Igual.ehIgual(2, 3)) {
            System.out.println("Interios iguais");
        }else{
            System.out.println("Inteiros diferentes");
        }

        if (Igual.ehIgual(2.3, 2.3)) {
            System.out.println("Double's iguais");
        }else{
            System.out.println("Double's diferentes");
        }

        if (Igual.ehIgual("UFERSA", "UFERSA")) {
            System.out.println("String's iguais");
        }else{
            System.out.println("String's diferentes");
        }
    }

}
