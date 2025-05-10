package switch_case_default;

import java.util.Scanner;

public class Switch_Case_Default {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Informe um valor interio entre 0 e 2 ");
        int a = tec.nextInt();
        
        switch(a){
            case 0:
                System.out.println("A variável recebeu o valor 0");
            break;
            
            case 1:
                System.out.println("A variável recebeu o valor 1");
            break;
            
            case 2:
                System.out.println("A variável recebeu o valor 2");
            break;
            
            default:
                System.out.println("A variavel recebeu qualquer outro valor não testado acima \n");
        }
    }
}
