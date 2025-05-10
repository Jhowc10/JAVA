/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicandoSobrecarga;

/**
 *
 * @author tatia
 */
public class Aluno extends Pessoa{
    
    // Atribultos locais que pertencem apenas ao aluno
    int   registroAcademico;
    float notaVestibular;
    String curso, dataIngresso;
    
    // Consttor de Aluno, vazio
    public Aluno(){
        // Ao criar a instância de um aluno, é preciso criar a instancia de uma pessoa com o construtor padrão da herança
        super();
    }
    
    // Sobrecarregando o construtor, com outra assinatura (já recebendo os atributos

    /**
     *
     * @param nome
     * @param rg
     * @param cpf
     * @param endereco
     * @param telFixo
     * @param telCel
     * @param dataNascimento
     * @param notaVestibular
     * @param curso
     * @param dataIngresso
     * @param registroAcademico
     */
    // Construtor Aluno sobrecarregado / Jeito 2
    public Aluno(String nome, String rg, String cpf, String endereco, String telFixo, String telCel, String dataNascimento,
                 int registroAcademico, float notaVestibular, String curso, String dataIngresso){
        
        super();
    
        // Atribui os dados para o objeto mãe
        // Como os nomes dos atributos são iguais, é preciso dizer qual estamos referenciando
        // Usamos a palavra " this " para indicar os parametros locais (recebidos nos atributos do construtor)
        this.rg = nome;
        this.nome = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telCel = telCel;
        this.telFixo = telFixo;
        this.dataNascimento = dataNascimento;
    
        // Agora atribui valores locais
        this.registroAcademico = registroAcademico;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataIngresso = dataIngresso;
    }
    
    // Note que o nome do metodo é exatamente o mesmo da classe mãe
    @Override
    public String retornaDados(){
        
        String dados;
        
        // Pega os dados da classe herdada
        dados = super.retornaDados();
        
        dados += "\t Registro Academico: " + registroAcademico + "\n";
        dados += "\t Nota no Vestibular: " + notaVestibular    + "\n";
        dados += "\t Curso: "              + curso             + "\n";
        dados += "\t Data de ingresso: "   + dataIngresso      + "\n";
        
        return dados;
    } 
}
