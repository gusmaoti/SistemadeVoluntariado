/**
 * Representa um voluntário.
 */
public class Voluntario {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private String disponibilidade;
    private String habilidades;

    /**
     * Construtor da classe Voluntario.
     *
     * @param nome Nome do voluntário.
     * @param cpf CPF do voluntário.
     * @param endereco Endereço do voluntário.
     * @param contato Contato do voluntário.
     * @param disponibilidade Disponibilidade de horário do voluntário.
     * @param habilidades Habilidades ou áreas de interesse do voluntário.
     */
    public Voluntario(String nome, String cpf, String endereco, String contato, String disponibilidade, String habilidades) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.disponibilidade = disponibilidade;
        this.habilidades = habilidades;
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

    public String getDisponibilidade() { return disponibilidade; }
    public void setDisponibilidade(String disponibilidade) { this.disponibilidade = disponibilidade; }

    public String getHabilidades() { return habilidades; }
    public void setHabilidades(String habilidades) { this.habilidades = habilidades; }
}
