import java.time.LocalDate;

/**
 * Classe principal para demonstrar a usabilidade do sistema.
 */
public class Main {
    public static void main(String[] args) {
        // Criação de instâncias
        Doador doador = new Doador("João Silva", "12345678901", "Rua A, 123", "joao@example.com");
        InstituicaoCaridade instituicao = new InstituicaoCaridade("Ajuda RS", "9876543210001", "Avenida B, 456", "contato@ajudars.org", "Distribuição de alimentos");
        Voluntario voluntario = new Voluntario("Maria Souza", "10987654321", "Rua C, 789", "maria@example.com", "Manhãs", "Cozinha, Logística");

        // Adicionando voluntário à instituição
        instituicao.adicionarVoluntario(voluntario);

        // Criação de uma doação
        Doacao doacao = new Doacao(doador, instituicao, "Dinheiro", 500.00, LocalDate.now());

        // Adicionando doação ao histórico do doador e da instituição
        doador.adicionarDoacao(doacao);
        instituicao.adicionarDoacao(doacao);

        // Exibindo informações do doador
        System.out.println("Doador:");
        System.out.println("Nome: " + doador.getNome());
        System.out.println("CPF: " + doador.getCpf());
        System.out.println("Endereço: " + doador.getEndereco());
        System.out.println("Contato: " + doador.getContato());
        System.out.println("Histórico de Doações:");
        for (Doacao d : doador.getHistoricoDoacoes()) {
            System.out.println("  Doação de " + d.getTipo() + " no valor de R$" + d.getValor() + " para " + d.getInstituicao().getNome() + " em " + d.getData());
        }

        // Exibindo informações da instituição
        System.out.println("\nInstituição de Caridade:");
        System.out.println("Nome: " + instituicao.getNome());
        System.out.println("CNPJ: " + instituicao.getCnpj());
        System.out.println("Endereço: " + instituicao.getEndereco());
        System.out.println("Contato: " + instituicao.getContato());
        System.out.println("Área de Atuação: " + instituicao.getAreaAtuacao());
        System.out.println("Voluntários:");
        for (Voluntario v : instituicao.getVoluntarios()) {
            System.out.println("  Nome: " + v.getNome() + ", CPF: " + v.getCpf() + ", Contato: " + v.getContato() + ", Disponibilidade: " + v.getDisponibilidade() + ", Habilidades: " + v.getHabilidades());
        }
        System.out.println("Histórico de Doações Recebidas:");
        for (Doacao d : instituicao.getHistoricoDoacoes()) {
            System.out.println("  Doação de " + d.getTipo() + " no valor de R$" + d.getValor() + " de " + d.getDoador().getNome() + " em " + d.getData());
        }
    }
}

