/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicandoheraca;

/**
 *
 * @author tatia
 */
public class Principal {
    public static void main(String[] args) {
        
        Aluno a1     = new Aluno()    ;
        Professor p1 = new Professor();
        
        // Veja que podemos acessar os atribuos diretamente, mesmo eles sendo da classe Pessoa
        // Isso ocorre pois o Aluno a1 é um objet da classe aluno que, por sua vez, [e filho de Pessoa
        a1.nome = "Josefino da Silva Sauro";
        a1.registroAcademico = 1234567890;
        a1.cpf = "001.002.003.00";
        a1.rg  = "999999-x";
        a1.curso = "Bacharelado em Artes Marciais";
        a1.dataNascimento = "01/10/2017";
        a1.endereco = "Rua das ruas, 10";
        a1.notaVestibular = 8;
        a1.telFixo = "(11) 98547-2236";
        a1.telCel = "(11) 93215-9963";
        
        
        // Idem para o Professor
        p1.nome = "Pedro Alvares";
        p1.salario = 200.00f;
        p1.cpf = "000.200.300-65";
        p1.dataNascimento = "26/04/1992";
        p1.rg = "02563498-8";
        p1.endereco = "Avenida dos Estados, 1254";
        p1.matricula = 90020;
        p1.telCel = "(11) 98564-3320";
        p1.telCel = "(11) 91568-9422";
        p1.telFixo = "(11) 2568-8755";
        
        
        // Vamos imprimir os dados do aluno a1
        System.out.println("Dados pessoais do aluno: ");
        System.out.println(a1.retornaDados());
        
        
        // Vamos retornar os dados do professor
        System.out.println("Dados pessoais do professor: ");
        System.out.println(p1.retornaDados());
    }
}
