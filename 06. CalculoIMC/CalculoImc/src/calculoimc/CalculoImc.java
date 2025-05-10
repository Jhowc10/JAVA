
package calculoimc;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        
        //Declaração do scanner
        Scanner leitor = new Scanner(System.in);
        
        // Declaração das variáveis
        float peso, altura, imc;
        
        // Leitura do teclado
        // Informação de instruções para o usuário
        System.out.println("Informe o PESO: ");
        
        // Le um valor real e armazana o valor do peso
        peso = leitor.nextFloat(); 
        
        // Le e armazena o valor da altura
        System.out.println("Informe a ALTURA");
        altura = leitor.nextFloat();
        
        // Calcula
        imc = peso/(altura*altura);
        
        // Imprime o resultado
        // Note que pode-se concatenar o resultado com a impressão de texto
        System.out.println("\n \t O imc desta pessoa é " + imc + "\n\n");
    }
}
