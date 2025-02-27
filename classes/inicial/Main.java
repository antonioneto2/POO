package classes.inicial;

class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo(a)");
        Data d1 = new Data(-1, -1, -1);
        d1.mostarData();
        Data d2 = Data.criaNatal(2022);
        d2.mostarData();
        Data d3 = Data.criaNatal( 0);
        if (d3!=null) d3.mostarData();
        

    }
}
