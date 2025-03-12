package reuso.empresa;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, String identidade, float salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + " salario=" + salario;
    }
}