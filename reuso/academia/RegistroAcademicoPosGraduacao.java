package reuso.academia;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(String nomeDoAulno, String matricula, String curso, String tituloTese, String orientador){
        this.registro = new RegistroAcademico(nomeDoAulno, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString(){
        return registro + "Titulo de tese: " + tituloTese + "Orientador: " + orientador;
    }
}
