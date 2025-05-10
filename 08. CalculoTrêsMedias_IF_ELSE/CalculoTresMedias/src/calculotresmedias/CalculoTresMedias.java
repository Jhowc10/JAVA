package calculotresmedias;

import java.util.Scanner;

public class CalculoTresMedias {

    public static void main(String[] args) {
        
        // Declarações
        Scanner teclado = new Scanner(System.in);
        
        float nota1, nota2, nota3, media;
        
        // Leitura das notas
        System.out.println("Informe as notas. ");
        
        // Nota 1
        System.out.println("\n \t Nota 1: ");
        nota1 = teclado.nextFloat();
        
        // Nota 2
        System.out.println("\t Nota 2: ");
        nota2 = teclado.nextFloat();
        
        // Nota 3
        System.out.println("\t Nota 3: ");
        nota3 = teclado.nextFloat();
        
        // Calcula usando um método com retorno
        media = calculaMedia(nota1, nota2, nota3);
        
        System.out.println("\n \t A media e " + media);
        
    }

    // O método estático (static) permite ser invocado sem a instância da classe:
    private static float calculaMedia(float n1, float n2, float n3) {
        
        float media;
        
        // Verifica as duas maiores e tira a média
        if(n1 < n2 && n1 < n3){
            media = (n2 + n3) / 2;
            
        }else if(n2 < n3){
            media = (n1 + n3) / 2;
            
        }else{
            media = (n1 + n2) / 2;
       }
        
        return media;
    }
}
