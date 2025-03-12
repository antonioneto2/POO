package reuso.academia;

public class RegistroAcademico {
    private String nomeDoAulno;
    private String matricula;
    private String curso;
    
    public RegistroAcademico(String nomeDoAulno, String matricula, String curso) {
        this.nomeDoAulno = nomeDoAulno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return "Nome: " + nomeDoAulno + "; "+ "Matricula: " + matricula + "; "+ "Curso: " + curso + ";";
    }
    


}
