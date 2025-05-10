/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplointerface;

import java.util.Scanner;

/**
 *
 * @author tatia
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Variáveis auxiliares
        String nomeAux   ;
        double salarioAux;
        int    diasAux   ;
        
        // Lê os dados para um funcionario mensalista
        System.out.println("Qual o nome do funcionario mensalista? ");
        nomeAux = teclado.next();
        
        System.out.println("Qual o valor do salario bruto do funcionario mensalista? ");
        salarioAux = teclado.nextDouble();
        
        
        // Constroi um funcionario mensalista na memoria (instancia)
        FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux, salarioAux);
        
        
        // Lê os dados para um funcionario diarista
        // Podemos usar a mesma variável, pois o funcionário mensalista já foi construido
        System.out.println("\n Qual o nome do funcionario diarista?");
        nomeAux = teclado.next();
        
        System.out.println("\n Qual o valor da hora deste funcionario mensalista? ");
        salarioAux = teclado.nextDouble();
        
        System.out.println("\n Quantos dias ele trabalhou? ");
        diasAux = teclado.nextInt();
        
        
        // Cria a instância de um funcionário diarista na memória, já com os dados
        FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux);
        
        
        // Agora vamos imprimir os dados cada um e o salário bruto (calculado)
        System.out.println("Dados e salario do Funcionario Mensalista: ");
        System.out.println("\t Nome: " + fM.nome);
        System.out.println("\t Salario Bruto: " + fM.calcularSalarioLiquido());
        
        
        System.out.println("--------------------------------------------");
        System.out.println("\n Dados e salario do Funcionario Diarista: ");
        System.out.println("\t Nome: " + fD.nome);
        System.out.println("\t Salario Bruto: " + fD.calcularSalarioLiquido());
    }
}
