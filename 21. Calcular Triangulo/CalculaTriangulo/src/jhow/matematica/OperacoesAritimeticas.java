/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhow.matematica;

/**
 *
 * @author tatia
 */
public class OperacoesAritimeticas {
    
    public float multiplica(float a, float b){
        return a * b;
    }
    
    public float soma(float a, float b){
        return a + b;
    }
    
    public float subtrai(float a, float b){
        return a - b;
    }
    
    public float divide(float a, float b){
        try{
            return a / b;
            
        }catch(Exception ex){
            System.out.println("Erro" + ex.getMessage());
            return 0;
            
        }
    }
}
