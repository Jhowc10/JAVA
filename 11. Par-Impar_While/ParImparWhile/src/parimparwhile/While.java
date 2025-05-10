package parimparwhile;

public class While {

    public static void main(String[] args) {
        
        int i = 0;
        
        while(i <= 10){
            if(i % 2 = 0){              // Verifica se o resto da divisão por 2 é zero. Se não for, então é impar
                System.out.println(i);
                i++;                     // No while a incrementação vem depois
            }
        }
    }
}
