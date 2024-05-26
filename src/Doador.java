import java.util.ArrayList;
import java.util.List;

/**
 * Representa um doador.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private List<Doacao> historicoDoacoes;

    /**
     * Construtor da classe Doador.
     *
     * @param nome Nome do doador.
     * @param cpf CPF do doador.
     * @param endereco Endereço do doador.
     * @param contato Contato do doador.
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public List<Doacao> getHistoricoDoacoes() { return historicoDoacoes; }

    /**
     * Adiciona uma doação ao histórico de doações do doador.
     *
     * @param doacao Doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        this.historicoDoacoes.add(doacao);
    }
}
