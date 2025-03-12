package reuso.empresa;

public class ChefeDeDepartamento extends Funcionario {
    private String departamento;

    public ChefeDeDepartamento(String nome, String identidade, float salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " departamento=" + departamento;
    }
    
    
/*  public String toString(){
        return "Nome: " + getNome() + "; " + "Identidade: " + getIdentidade() + "; " + "Departamento : " + departamento;
    }
 */
}
