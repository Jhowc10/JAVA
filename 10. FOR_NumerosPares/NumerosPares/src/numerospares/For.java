package numerospares;

public class For {

    public static void main(String[] args) {
        
        for(int i = 50; i >= 0; i--){                              // Para i de 0 a 10 (inclusive), repita
            if(i % 2 == 0){                                       // Verifica se a variável que pe incrementada é divisivel por 2, ou seja
                System.out.println("O numero " + i + " e par");    // se o rsto de sua divisão por 2 é 0
            
            }else{
                System.out.println("O numero " + i + " e impar");
            }
        }  
        
        System.out.println("\n \n");
        
        for(int j = 0; j <= 50; j++){                              
            if(j % 2 == 0){                                       
                System.out.println(j + " e par");    
            
            }else{
                System.out.println(j + " e impar");
            }
        }
    }
}

