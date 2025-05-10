/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jhow.principal;

// Importa a classe trigonometria. Se quisermos importar todas as classes do pacote, ficaria assim:
// import jhow.matematica.*

import jhow.matematica.Trigonometria;
import java.util.Scanner;

/**
 *
 * @author tatia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Chamando a classe trigonometria
        Trigonometria tri = new Trigonometria();
        
        Scanner sc = new Scanner(System.in);
        
        float base, altura;
        
        System.out.print("Informe o valor da base do triângulo: ");
        base = sc.nextFloat();
        
        System.out.print("Informe o valor da altura do triângulo: ");
        altura = sc.nextFloat();
        
        System.out.println("\n A área dete triângulo é: ");
        System.out.println(tri.areaTriangulo(base, altura));
    }
    
}
