package explicandoheraca;

public class Pessoa {
        
    // Para facilitar, vamos trabalhar com String aqui
    String nome, rg, cpf, endereco, telFixo, telCel, dataNascimento;
        
    // Métodp simples para montar e retornar uma String com os dados da Pessoa
    public String retornaDados(){
        String dados = "";
        dados += "Nome: "             + nome                + "\n";
        dados += "\t rg: "            + rg                  + "\n";
        dados += "\t cpf: "           + String.valueOf(cpf) + "\n";
        dados += "\t Telefone fixo: " + telFixo             + "\n";
        dados += "\t Telefone cel:  " + telCel              + "\n";
        
        return dados;     
    }
}
