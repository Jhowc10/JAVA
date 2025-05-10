package implementandomaisdeumainterface;

public class Principal {

    public static void main(String[] args) {
        
        ClasseA c = new ClasseA();
        
        double v = c.metodoA();
        String x = c.metodoB(10);
        
        System.out.println(x);
        System.out.println(v);
    }
}
