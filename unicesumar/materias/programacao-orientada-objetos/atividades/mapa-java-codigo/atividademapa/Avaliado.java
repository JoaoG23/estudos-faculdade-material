package atividademapa;

/**
 * Interface Avaliado
 * Define o contrato para classes que podem ser avaliadas
 * através do método avaliarDesempenho()
 */
public interface Avaliado {
    
    /**
     * Método que avalia o desempenho de uma entidade
     * @return String contendo a avaliação de desempenho
     */
    public String avaliarDesempenho();
}