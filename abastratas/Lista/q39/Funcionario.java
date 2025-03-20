package abastratas.Lista.q39;

public class Funcionario {
    private String nome, cargo;
    private float salarioPorHora;
        
    public Funcionario(String nome) {
        this.nome = nome;
        cargo = "Bolsista";
        salarioPorHora = 2F;
    }

    public Funcionario(String nome, String cargo, float salarioPorHora) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioPorHora = salarioPorHora;
    }

    public float salarioMes() {
        return salarioPorHora * 220;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salarioMes()=" + salarioMes() + "]";
    }
}
