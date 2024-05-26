import java.time.LocalDate;

/**
 * Representa uma doação.
 */
public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicao;
    private String tipo;
    private double valor;
    private LocalDate data;

    /**
     * Construtor da classe Doacao.
     *
     * @param doador Doador da doação.
     * @param instituicao Instituição beneficiada pela doação.
     * @param tipo Tipo de doação.
     * @param valor Valor da doação.
     * @param data Data da doação.
     */
    public Doacao(Doador doador, InstituicaoCaridade instituicao, String tipo, double valor, LocalDate data) {
        this.doador = doador;
        this.instituicao = instituicao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    // Getters e Setters
    public Doador getDoador() { return doador; }
    public void setDoador(Doador doador) { this.doador = doador; }

    public InstituicaoCaridade getInstituicao() { return instituicao; }
    public void setInstituicao(InstituicaoCaridade instituicao) { this.instituicao = instituicao; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
