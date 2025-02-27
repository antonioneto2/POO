package   classes.inicial;

class Data {
    private int dia;
    private int mes;
    private int ano;


    

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (!dataEhValida()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean dataEhValida(){
        return(dia >=1 && dia<=31 && mes>=1 && mes<=12 && ano>=0);
    }

    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
        if (!dataEhValida()) {
            dia = 1;
            mes = 1;
            ano = 2000;
        }
    }

    public void mostarData(){
        System.out.println(dia +"/"+ mes +"/"+ano);
    }

    public static Data criaNatal(int ano){
        if (ano > 0 ){
            return new Data(25, 12, ano);
    }else{
        System.out.println("Ano inválido");
        return null;
    }
    }

    public static Data criaData(int dia, int mes, int ano){
        if (dia >=1 && dia<=31 && mes>=1 && mes<=12 && ano>=0){
            return new Data(25, 12, ano);
    }else{
        System.out.println("Ano inválido");
        return null;
    }
    }


}
