package atividademapa;

/**
 * Classe base Pessoa
 * Representa uma pessoa genérica com nome
 */
public class Pessoa {
    private String nome; // Nome da pessoa
    
    /**
     * Construtor padrão
     */
    public Pessoa() {
    }
    
    /**
     * Obtém o nome da pessoa
     * @return String contendo o nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Define o nome da pessoa
     * @param nome Novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Método que apresenta a pessoa
     * @return String com apresentação básica
     */
    public String apresentar() {
        return "Olá, meu nome é " + nome + ".";
    }
}