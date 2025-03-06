package classes.faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private float percentualDeCobranca;

    public void inicializaRegistroAcademico(String nome, String matricula, int codicoCurso, float percentualDeCobranca){
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codicoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
    }


    public float calculaMensalidade(){
        return 100 * codigoCurso * percentualDeCobranca;
    }
}
