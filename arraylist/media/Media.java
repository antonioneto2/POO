package arraylist.media;

public class Media {
    public static void main(String[] args) {
        System.out.println(media(1.5, 2.0));
        System.out.println(media(1.5, 2.0, 3.0));
        System.out.println(media(1.5, 2.0, 4.0, 5.0));
        System.out.println(media(1.5, 2.0, 6.0, 4.0, 7.0));
    }

    public static double media(double... numeros){
        double soma = 0.0;
        for (double d : numeros) {
            soma += d;
        }
        double media = soma / numeros.length;
        return media;
    }
}
