/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.jhow.dao;

import br.jhow.negocio.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tatia
 */
public class CarroDAO {
    
    // metodo que retorna a lista de carros, com todos os carros do sistema
    public List<Carro> getListaDeCarros(){
        
        try{
            // Conecta ao banco através da classe conexão
            Conexao con = new Conexao();
            con.getConexao();
            
            // Select da tabela carros
            String sql = "select * from tb_carros;";
            
            // Executa a query
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            
            // Prepara a lista de carros para retornar
            List<Carro> listaDeCarros = new ArrayList<Carro>();
            
            // Para cada item retornado no select, faça...
            while(resultado.next()){
                Carro c = new Carro();      // Cria um carro novo na memória
                
                c.setIdCarro   (resultado.getInt   ("idCarro"))     ; // Seta o ID dele
                c.setFabricante(resultado.getString("fabricante"))  ; // Seta o fabricante
                c.setModelo    (resultado.getString("modelo"))      ; // Seta o modelo
                c.setCor       (resultado.getString("cor"))         ; // Seta a cor
                c.setKm        (resultado.getDouble("km"))          ; // Seta o km
                c.setValor     (resultado.getDouble("valor"))       ; // Seta o valor
                c.setAno       (resultado.getInt   ("anoFabricacao")); // Seta o ano
                
                // Insere o carro da lista local
                listaDeCarros.add(c);
            }
            
            // Ao terminar o laço, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();
            
            // Retorna a lista de carros
            return listaDeCarros;
            
        }catch(Exception e){    // Se der alguma exessão...
            System.out.println(e.getMessage());
            
            return null;
        }
    }
    
    public boolean insereCarros(Carro c){
        try{
            //  Seta e abre conexão
            Conexao conexao = new Conexao();
            conexao.getConexao();
            
            // Query de inserção, as aspas são muito importante
            String sql = "";
            
            sql += "insert into tb_Carros(`fabricante`, `modelo`, `anoFabricacao`, `cor`, `km`, `valor`)";
            sql += "VALUES";
            sql += "('" + c.getfabricante() + "', '" + c.getModelo() + "', " + c.getAno() + ", '" + c.getCor() + "', " + c.getKm() + ", " + c.getValor() + ")";
            
            // Executa
            PreparedStatement comando = conexao.getConexao().prepareStatement(sql);
            comando.executeUpdate(sql);
            
            return true;                 // Se inseriu, retorna verdadeiro
            
        }catch(Exception e){              // Se eu algum erro...
            System.out.println(e.getMessage());
            
            return false;
        }
    }
}
