/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.jhow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tatia
 */
public class Conexao {
      // Status da conexão para consultas
    private String statusConexao = "Não conectado";
    
    public Connection getConexao(){ 
        
        // Atributo para conexão
        Connection conexao = null;
        
        // Começa a tentativa de conexão
        try{
            
            // Designa o driver de conexão padrão para essa conexão
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            
            // Seta os paâmetros da conexão ao banco - IMPORTANTE AQUI
            String servidor = "localhost";       // Caminho de rede do banco de dados
            String schema   = "estoque_carros";  // Nome do schema que será usado
         
            // URL para o diver JDBC
            String url = "jdbc:mysql://" + servidor + "/" + schema;
            
            // Pàrâmetros da conexão (usuario e senha)
            // Atenção: COLOQUE AQUI O SEU USUÁRIO E A SENHA.
            String usuario = "root";
            String senha   = "T@t171089";
           
            
            // Seta  a conexão
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
            
            // Testa a conexão
            if(conexao != null){   // Se a conexão for ok ela não é anulada
                
                // Troca o status da conexão
                statusConexao = ("Conectado");
                
            }else{
                statusConexao = ("Não conectado");
            }
            
            // Retorna a conexão para quem for utiliza-la
            return conexao;
            
        }catch(ClassNotFoundException e){   // Caso não encontre o driver de conexão
            System.out.println("Driver de conexão não encontrado ");
            
            return null;
            
        }catch(SQLException e){  // Caso não consiga conectar
            System.out.println("Falha na conexão: ");
            System.out.println(e.getMessage());
            
            return null;
        }
    }
    
    // Retorna o status da conexão
    public String getStatusConexao(){
        return statusConexao;
    }
    
    // Método para fechar / encerrar a conexão
    public boolean FechaConexao(){
        try{
            getConexao().close();                // Fecha
            statusConexao = "Conexão Fechada ";  // Atualiza o status
            return true;                         // Retorna vdd se fechar
        }catch(SQLException e){
            // Se der um erro imprime
            System.out.println(e.getMessage());
            
            return false;
        }
    }
    
    // Caso precise reiniciar sua conexão
    public Connection ReiniciaConexao(){
        FechaConexao();
        
        return getConexao();   // Abre conexão
    }
}
