/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicandoheraca;

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
    
    public String retornaDadosProfessor(){
        
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
