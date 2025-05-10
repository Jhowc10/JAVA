package explicandoheraca;

public class Aluno extends Pessoa{
    
    // Atribultos locais que pertencem apenas ao aluno
    int   registroAcademico;
    float notaVestibular;
    String curso, dataIngresso;
    
    
    // `Para reutilizar o mesmo nome de uma função / metodo, usamos o " @Override "
    // Note que o nome do método é exatamente o mesmo da classe mãe
    @Override
    public String retornaDados(){
        
        String dados;
        
        // Pega os dados da classe herdada
        dados = super.retornaDados();
        
        dados += "\t Registro Academico: " + registroAcademico + "\n";
        dados += "\t Nota no Vestibular: " + notaVestibular    + "\n";
        dados += "\t Curso: "              + curso             + "\n";
        dados += "\t Data de ingresso: "   + dataIngresso      + "\n";
        
        return dados;
    } 
}
