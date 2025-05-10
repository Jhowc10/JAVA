package comparandostring;

import java.util.Scanner;

public class ComMetodoEquals {

    public static void main(String[] args) {
        
        // Declarações
        String nome1, nome2;
        Scanner teclado = new Scanner(System.in);
        
        // Leitura
        System.out.println("Informe o 1º nome: ");
        nome1 = teclado.next();
        
        System.out.println("Informe o 2º nome: ");
        nome2 = teclado.next();
        
        // Compara deconsiderando a caixa
        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("\n Os nomes digitados são iguais");
        
        }else{
            System.out.println("\n Os nomes digitados são difrentes");
        }
    }
}
