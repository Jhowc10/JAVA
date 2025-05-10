/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicandoheraca;

/**
 *
 * @author tatia
 */
public class Aluno extends Pessoa{
    
    // Atribultos locais que pertencem apenas ao aluno
    int   registroAcademico;
    float notaVestibular;
    String curso, dataIngresso;
    
    public String retornaDadosAluno(){
        
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
