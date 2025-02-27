package classes.Lista.q03;

public class DemoAluno {
    public static void main(String[] args) {
        AlunosUfersa a1 = new AlunosUfersa(202202, "Antonio", 6, 5, 8);
        
        System.out.println("Matrícula: " + a1.matricula);
        System.out.println("Nome: " + a1.nome);
        System.out.println("Média parcial: " + a1.media());
        double ef = a1.provaFinal();
        if (ef >= 5 ) {
            System.out.println("O aluno não precisa realizar a prova final.");
        }else{
            System.out.println("O aluno precisa tirar " + ef + " no exame final para ser aprovado.");
        }
    }
}
