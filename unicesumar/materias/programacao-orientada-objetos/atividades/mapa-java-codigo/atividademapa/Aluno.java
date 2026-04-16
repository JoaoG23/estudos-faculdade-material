package atividademapa;

/**
 * Classe Aluno que herda de Pessoa e implementa a interface Avaliado
 * Representa um estudante com matrícula e curso
 */
public class Aluno extends Pessoa implements Avaliado {
    private String matricula; // Número de matrícula do aluno
    private String curso;     // Nome do curso do aluno

    /**
     * Construtor padrão
     */
    public Aluno() {
    }
    
    /**
     * Obtém a matrícula do aluno
     * @return String contendo a matrícula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define a matrícula do aluno
     * @param matricula Nova matrícula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /**
     * Obtém o curso do aluno
     * @return String contendo o nome do curso
     */
    public String getCurso() {
        return curso;
    }
    
    /**
     * Define o curso do aluno
     * @param curso Novo curso
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /**
     * Sobrescreve o método apresentar da classe Pessoa
     * @return String com apresentação personalizada do aluno
     */
    @Override
    public String apresentar() {
        return "Olá, sou " + getNome() + ", estudante do curso de " + curso + " com matrícula " + matricula + ".";
    }
    
    /**
     * Implementação do método avaliarDesempenho da interface Avaliado
     * @return String com avaliação de desempenho do aluno
     */
    @Override
    public String avaliarDesempenho() {
        return "Aluno " + getNome() + " obteve ótimo desempenho!";
    }
}