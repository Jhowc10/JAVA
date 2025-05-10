/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraquatrooperacoes;

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
        
        Scanner tc = new Scanner(System.in);
        
        float num1, num2;
        
        // Instanciando
        Calculadora calc = new Calculadora();
        
        System.out.print("Informe o 1º valor: ");
        num1 = tc.nextFloat();
        
        System.out.print("Informe o 2º valor: ");
        num2 = tc.nextFloat();
        
        // Seta na instância de calculadora (calc) os valores a e b
        calc.setA(num1);
        calc.setB(num2);
        
        System.out.println("As quetro operacoes aplicadas aos valores " + calc.getA() + " e " + calc.getB() + " sao");
        System.out.println("\t Soma: "       + calc.soma()      );
        System.out.println("\t Subtrai: "    + calc.subtrai()   );
        System.out.println("\t Multiplica: " + calc.multiplica());
        System.out.println("\t Divide: "     + calc.divide()    );
    }
    
}
