/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.jhow.view;

// Importa as classes necessária
import br.jhow.dao.CarroDAO;
import br.jhow.negocio.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tatia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Para poder visualizar, temos que chamar o metodo de visualização, feito fora do método main, por isso o invocamos aqui
        listaTodosCarros();
        
        
        // INCERINDO NO BANCO DE DADOS
        // Vamos inserir um carro novo no banco de dados
        // Cria a instância e seta os valores (você pode lêr do teclado se quiser)
        // O new Carro() é a classe Carro
        Carro carro = new Carro();
        
        carro.setAno       (2017)    ;
        carro.setCor       ("Verde") ;
        carro.setFabricante("Honda") ;
        carro.setKm        (200)     ;
        carro.setModelo    ("Accord");
        carro.setValor     (160000)  ;
        
        // Note que não setamos o ID, pois ele [e auto incrementado pelo banco
        // Insere
        CarroDAO cD = new CarroDAO();
        cD.insereCarros(carro);
        
        System.out.println("\n\n Carro inserido! \n\n");
        
        // Vamos listar todos os carros agora, para ver o novo carro na lista
        listaTodosCarros();
    }
    
    
    
    // VISUALIZANDO O BANCO DE DADOS
    // Método de listagem de todos os carros
    public static void listaTodosCarros(){
        
        // Cria uma instância de carrosDAO na memória
        CarroDAO carro = new CarroDAO();
        
        // Cria a lista de carros local que será preenchida
        List<Carro> listaDeCarros = new ArrayList<Carro>();
        
        // Obtem a lista de carros através do objeto
        listaDeCarros = carro.getListaDeCarros();
        
        // Começa a imprimir os dados
        System.out.println("ID \t | \t Marca \t |  Modelo \t | \t Ano \t | \t Cor \t | \t Km \t | \t Preço \t");
        System.out.println("---\t | \t-------\t | --------\t | \t-----\t | \t-----\t | \t----\t | \t-------\t");
        
        for(Carro carroLocal : listaDeCarros){  // Interator: Para cada carro na list de carro
            System.out.print(carroLocal.getIdCarro()    + "\t | \t");
            System.out.print(carroLocal.getfabricante() + "\t | \t");
            System.out.print(carroLocal.getModelo()     + "\t | \t");
            System.out.print(carroLocal.getAno()        + "\t | \t");
            System.out.print(carroLocal.getCor()        + "\t | \t");
            System.out.print(carroLocal.getKm()         + "\t | \t");
            System.out.print(carroLocal.getValor()      + "\t | \t");
            System.out.println("");
        }
    }
    
}
