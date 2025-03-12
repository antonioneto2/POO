package arraylist.Lista.q17;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(new EntradaEmAgenda(28 , 2, 2025, 19, "Aniversário de 20 anos!"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(28 , 2, 2025, 10, "Consulta medica"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(10 , 1, 2025, 0, "Aniversário de 1 ano de namoro!"));

        agenda.listaDia(28, 2, 2025);
    }
}
