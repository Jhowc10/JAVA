/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface;

/**
 *
 * @author tatia
 */
public class FuncionarioMensalista implements Operacoes{
    
    // Atributos
    String nome   ;
    double salario;
    
    // Construtor que recebe parâmetros de entrada e seta localmente
    public FuncionarioMensalista(String nome, double salario){
        this.nome    = nome   ;
        this.salario = salario;
    }

    // Sobrescrevendo obrigatóriamente o método de cálculo do salário
    @Override
    public double calcularSalarioLiquido() {
        return this.salario - this.salario * 27.5 / 100;
    }
}
