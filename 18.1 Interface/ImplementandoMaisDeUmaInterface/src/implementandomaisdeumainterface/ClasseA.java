package implementandomaisdeumainterface;

public class ClasseA implements InterfaceA, InterfaceB{
    
    // Reimplantando o métodoA, da interface A
    @Override
    public double metodoA(){
        return 10.5;
    }
    
    // Reimplantando o métodoB, da interfaceB
    @Override
    public String metodoB(double valor){
        if(valor <= 10){
            return "Valor valido";
        
        }else{
            return "Valor invalido";
        }
    }
}
