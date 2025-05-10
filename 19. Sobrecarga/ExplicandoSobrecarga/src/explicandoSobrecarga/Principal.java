/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicandoSobrecarga;

/**
 *
 * @author tatia
 */
public class Principal {
    public static void main(String[] args) {
        
        // Agora podemos criar o alunos com os dados diretamente no construtor dele
        /*
            Lembre-se que os atributos devem ir na mesma ordem do construtor da classe
        
            A ordem é:
            String nome, String RG, String cpf, String endereco, String telFixo, String telCelular, String dataNascimento,
            int registroAcademico, float notaVestibular, String curso, String dataIngresso
        */
        
        
        
        Aluno a1     = new Aluno("Josefino Sauro", "001101-x", "001.002.003.00", "Rua das Ortencias, 10", "(11) 93254-8875",
                                 "(11) 92541-7530", "10/02/1991", 1902192, 8.5f, "Bacharelado em Tecnologia", "10/10/2017");    
                
        
        Professor p1 = new Professor("Maria Santos", "110251-x", "100.202.303.01", "Rua Julio Dantas, 16", "(11) 95789-2455",
                                     "(11) 93654-2315", "22/09/1988", "05/12/2022", 2984, 590.6f);
        
        
        // Vamos imprimir os dados do aluno a1
        System.out.println("Dados pessoais do aluno: ");
        System.out.println(a1.retornaDados());
        
        
        //Vamos retornar os dados do professor
        System.out.println("Dados pessoais do professor: ");
        System.out.println(p1.retornaDados());
    }
}
