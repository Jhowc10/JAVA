/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author tatia
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Operador ternario
        int n1, n2, r;
        
        n1 = 14;
        n2 = 18;
        
        r = (n1 > n2) ? n1+n2 : n2-n1;
        
        System.out.println(r);
    }
    
}
