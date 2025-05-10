/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploclasseabstrata;

/**
 *
 * @author tatia
 */
class Aluno extends PessoaGenerica{

    @Override
    public String getDados(){
        
        String dados = " ";
        dados += "\n Nome: "   + nome  ;
        dados += "\n CPF: "    + cpf   ;
        dados += "\n RG: "     + rg    ;
        dados += "\n dtNasc: " + dtNasc;
        
        return dados;
    }
}
