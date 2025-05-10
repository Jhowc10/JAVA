package javaapplication7;

public class ClasseMatematica {

    // Atributos locais
    int a, b;
    
    // Construtor da classe, que recebe dois valores (x e y) e atribui aos valores locais (a e b);
    public ClasseMatematica(int x, int y){
        
        a = x;
        b = y;
    }
    
    //Metodo de somo
    public int soma(){
        return a + b;
    }
        
    // Metodo de subtração
    public int subtrai(){
        return a - b;
    }
    
    // Metodo de multiplicação
    public int multiplica(){
        return a * b;
    }
    
    // Metodo de divisão
    public int divide(){
        return a / b;
    }
}
