import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instituição de caridade.
 */
public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private List<Voluntario> voluntarios;
    private List<Doacao> historicoDoacoes;

    /**
     * Construtor da classe InstituicaoCaridade.
     *
     * @param nome Nome da instituição.
     * @param cnpj CNPJ da instituição.
     * @param endereco Endereço da instituição.
     * @param contato Contato da instituição.
     * @param areaAtuacao Área de atuação da instituição.
     */
    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = new ArrayList<>();
        this.historicoDoacoes = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public String getAreaAtuacao() { return areaAtuacao; }
    public void setAreaAtuacao(String areaAtuacao) { this.areaAtuacao = areaAtuacao; }

    public List<Voluntario> getVoluntarios() { return voluntarios; }

    public List<Doacao> getHistoricoDoacoes() { return historicoDoacoes; }

    /**
     * Adiciona um voluntário à lista de voluntários da instituição.
     *
     * @param voluntario Voluntário a ser adicionado.
     */
    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    /**
     * Adiciona uma doação ao histórico de doações da instituição.
     *
     * @param doacao Doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        this.historicoDoacoes.add(doacao);
    }
}
