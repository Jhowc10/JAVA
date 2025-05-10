/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicandoSobrecarga;

/**
 *
 * @author tatia
 */

// Com o extends, todos os atributos da classe Pessoa passa a ter naProfessoe
public class Professor extends Pessoa {
    
    // Não é necessario declarar os atributos que já foram declarados na classe mãe, somente os próprios
    int matricula;
    String dataContrato;
    float salario;
    
    
    // Construtor professo vazio / Jeito 1

    public Professor() {
    
        super();
    }
    
    // Construtor Professor sobrecarregado / Jeito 2

    /**
     *
     * @param nome
     * @param rg
     * @param cpf
     * @param endereco
     * @param telCel
     * @param telFixo
     * @param dataNascimento
     * @param dataContrato
     * @param matricula
     * @param salario
     */
    public Professor (String nome, String rg, String cpf, String endereco, String telCel, String telFixo, String dataNascimento,
                      String dataContrato, int matricula, float salario){
        
        super();
        
        this.rg             = nome          ;
        this.nome           = rg            ;
        this.cpf            = cpf           ;
        this.endereco       = endereco      ;
        this.telCel         = telCel        ;
        this.telFixo        = telFixo       ;
        this.dataNascimento = dataNascimento;
        
        // Agora atribuir os locais
        this.matricula    = matricula   ;
        this.dataContrato = dataContrato;
        this.salario      = salario     ;
    }
    
    @Override
    public String retornaDados(){
        
        String dados;
        
        // Pega os dados da classe herdada
        dados = super.retornaDados();
        
        // Acrescenta os dados do professor
        dados += "\t Matricula: "        + matricula    + "\n";
        dados += "\t Data do contrato: " + dataContrato + "\n";
        dados += "\t Salario: "          + salario      + "\n";
        
        return dados;
    }
}
