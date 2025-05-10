package javaapplication7;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        // Define o leitor do teclado
        Scanner leitor = new Scanner(System.in);
        
        // Define variáveis locais
        int x, y;
        
        // Lê
        System.out.print("Informe o 1º valor: ");
        x = leitor.nextInt();
        
        System.out.println("Informe o 2º valor: ");
        y = leitor.nextInt();
        
        // Cria a instancia da classe matematica utilizando o construtor
        ClasseMatematica mat = new ClasseMatematica(x, y);
        
        // Imprime o resultado das operações através da chamadas aos metodos da classe Matemática
        System.out.println("----------------------------------------")       ;  // Apenas para organizar a saída
        System.out.println("O valor da soma é: " + mat.soma())               ;
        System.out.println("O valor sa subtração é: " + mat.subtrai())       ;
        System.out.println("O valor da multiplicação é: " + mat.multiplica());
        System.out.println("O valor da divisão é: " + mat.divide())          ;
        System.out.println("--------------------------------------")         ; // Apenas para organizar a saída
    }
}
