package arraylist.Lista.q19;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<>();

    while (true) {
        System.out.print("Digite o ID do cliente (número negativo para sair): ");
        int id = scanner.nextInt();
        if (id < 0) break;
        
        scanner.nextLine(); // Limpar buffer do teclado
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        
        scanner.nextLine(); // Limpar buffer do teclado
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        
        clientes.add(new Cliente(id, idade, telefone, nome));
    }
    
    System.out.println("\nLista de Clientes Cadastrados:");
    for (Cliente c : clientes) {
        System.out.println(c);
    }
    
    scanner.close();
    }
}
