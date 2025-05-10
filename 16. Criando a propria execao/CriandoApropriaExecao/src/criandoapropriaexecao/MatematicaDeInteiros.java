package criandoapropriaexecao;

import java.util.Scanner;

public class MatematicaDeInteiros {

    public static void main(String[] args) {
        
        float x, y, resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculadora de valores positivos");
        
        System.out.println("\t Valor 1: ");
        x = teclado.nextFloat();
        
        System.out.println("\t Valor 2: ");
        y = teclado.nextFloat();
        
        try{
            // Se o valor a ser subtraido for menor, sobre a exeção
            if(y > x){
                throw new IllegalArgumentException("Y não pode ser subtraido de x, pois é maior que x");
                
            }else{
                resultado = x - y;
                System.out.println("Resultado: " + resultado);
                
            }
            
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());  // Imprime o erro
        }
    }
}
