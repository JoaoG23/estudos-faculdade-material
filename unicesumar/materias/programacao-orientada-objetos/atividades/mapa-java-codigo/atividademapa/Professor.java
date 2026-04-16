package atividademapa;

/**
 * Classe Professor que herda de Pessoa
 * Representa um professor com disciplina
 */
public class Professor extends Pessoa {
    private String disciplina; // Disciplina lecionada pelo professor
    
    /**
     * Construtor padrão
     */
    public Professor() {
    }
    
    /**
     * Obtém a disciplina do professor
     * @return String contendo a disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }
    
    /**
     * Define a disciplina do professor
     * @param disciplina Nova disciplina
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * Sobrescreve o método apresentar da classe Pessoa
     * @return String com apresentação personalizada do professor
     */
    @Override
    public String apresentar() {
        return "Olá, sou " + getNome() + ", professor(a) da disciplina de " + disciplina + ".";
    }
}