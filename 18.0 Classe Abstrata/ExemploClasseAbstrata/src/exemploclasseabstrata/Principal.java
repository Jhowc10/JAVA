/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploclasseabstrata;

/**
 *
 * @author tatia
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        
        a1.nome   = "Jhow"          ;
        a1.cpf    = "345.624.877-69";
        a1.rg     = "62458796-2"    ;
        a1.dtNasc = "07-09-1988"    ;
        
        System.out.println(a1.getDados());
    }
}
