package arraylist.Lista.q19;

public class Cliente {
    private int id, idade;
    private String telefone, nome;
    
    
    public Cliente(int id, int idade, String telefone, String nome) {
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;
    }
    
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | Telefone: " + telefone;
    }

}
