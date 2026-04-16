package atividademapa;

/**
 * Classe principal que demonstra o uso das classes Pessoa, Aluno, Professor
 * e a implementação da interface Avaliado
 */
public class AtividadeMapa {
    /**
     * Método principal que executa o programa
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criando um objeto Aluno com seus dados
        Aluno aluno = new Aluno();
        aluno.setNome("João Guilherme Tito");
        aluno.setMatricula("24098553-5");
        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        
        // Criando um objeto Professor com dados fictícios
        Professor professor = new Professor();
        professor.setNome("Edmar Senne");
        professor.setDisciplina("Programação Orientada a Objetos");
        
        // Exibindo todos os atributos do Aluno
        System.out.println("===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        
        // Exibindo todos os atributos do Professor
        System.out.println("\n===== DADOS DO PROFESSOR =====");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        
        // Demonstrando polimorfismo com o método apresentar()
        System.out.println("\n===== DEMONSTRAÇÃO DE POLIMORFISMO =====");
        
        // Usando referências do tipo Pessoa para demonstrar polimorfismo
        Pessoa pessoa1 = aluno;
        Pessoa pessoa2 = professor;
        
        System.out.println("Apresentação do Aluno: " + pessoa1.apresentar());
        System.out.println("Apresentação do Professor: " + pessoa2.apresentar());
        
        // Demonstrando o uso da interface Avaliado
        System.out.println("\n===== DEMONSTRAÇÃO DA INTERFACE AVALIADO =====");
        
        // Invocando o método avaliarDesempenho() para o objeto Aluno
        System.out.println("Avaliação: " + aluno.avaliarDesempenho());
    }
}