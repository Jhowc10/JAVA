
package array;

public class Array {

    public static void main(String[] args) {
        // Declaração do array de strings de tamanho 3
        String nomes[] = new String[3];
        
        // Seta, manualmente, cada posição do array, de 0 a 2 (três posições)
        nomes[0] = "Josefino" ;
        nomes[1] = "Josefina" ;
        nomes[2] = "Marcelino";
        
        // E para acessar cada posição, podemos usar um laço de laço de 0 a 2 (0, 1, 2)
        for(int i = 0; i <= 2; i++){
            System.out.println("Na posição " + i + " do array, temos: ");
            System.out.println(nomes[i]);
        }
    }
}
