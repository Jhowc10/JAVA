package br.uninove.poo.persistencia;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;


public class ClienteDAO {
    
    // Não esqueça de atualiza para os dados de seu banco de dados
    String url = "jdbc:mysql://localhost:3306/pequenoprogeto";
    String usuario = "root";
    String senha = "T@t171089";
    String driver = "com.mysql.jdbc.Driver";
    
    Connection con;
    PreparedStatement st;    // Prepara para adicionar no BD
    private ResultSet rs;    // Prepara para pegar o resultado
    
    
    
    // Conexão com o banco de dados
    public int conectar(){
        try{
            Class.forName(driver);
            
            con = DriverManager.getConnection(url, usuario, senha);
            return 1;
            
        }catch(ClassNotFoundException ex){
            return 2;
            
        }catch(SQLException ex){
            return 3;
            
        }
    }
    
    // Desconecta do banco de dados
    public int desconectar(){
        try{
            con.close();
            return 1;
            
        }catch(SQLException ex){
            return 0;
            
        }
    }
    
    // Insere dados no banco de dados
    public int salvar(Cliente cli){       // Cliente se refere a Classe Cliente e cli é o apelido dado para chamar.
        try{
            st = con.prepareStatement("insert into cliente" + "(id, nome, telefone, sexo, renda)" + "values(?, ?, ?, ?, ?)");
            st.setInt   (1, cli.getId()      );  // 1 se refere ao primeiro parametro do " values "
            st.setString(2, cli.getNome()    );  // 2 se refere ao segundo  parametro do " values "
            st.setString(3, cli.getTelefone());  // 3 se refere ao terceiro parametro do " values "
            st.setString(4, cli.getSexo()    );  // 4 se refere ao quarto   parametro do " values "
            st.setDouble(5, cli.getRenda()   );  // 5 se refere ao quinto   parametro do " values "
            
            int retorno = st.executeUpdate();
            
            return retorno;
            
        }catch(SQLException ex){
            int c = ex.getErrorCode();
            
            if(c == 1062){
                return 2;
                
            }else{
                return 3;
                
            }
        }
    }
    
    // Metodo para consultar apenas um cliente cujo id foi informado
    public Cliente buscar(int id){
        try{
            st = con.prepareStatement("select * from cliente where id = ? ");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            
            if(rs.next()){
                Cliente cli = new Cliente();
                cli.setId(rs.getInt(id));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setSexo(rs.getString("sexo"));
                cli.setRenda(rs.getDouble("renda"));
                
                return cli;
                
            }else{
                return null;
                
            }
            
        }catch(SQLException ex){
            return null;
            
        }
    }
    
    // Método para buscar todos os registros cadastrados
    public ArrayList buscarTudo(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();  // Criando um Array com nome listaClientes. O <Cliente> se refere a classe Cliente
        
        try{
            st = con.prepareStatement("select * from cliente");
            rs = st.executeQuery();
            
            while(rs.next()){
                Cliente cli = new Cliente();
                
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setSexo(rs.getString("sexo"));
                cli.setRenda(rs.getDouble("renda"));
                
                listaClientes.add(cli);
            }
            
            return listaClientes;
            
        }catch(SQLException ex){
            return null;
            
        }
    }
    
    // Metodo para excluir um registro cujo id foi informado
    public int excluir(int id){
        try{
            st = con.prepareStatement("delete from cliente where id = ? ");
            st.setInt(1, id);
            
            int r = st.executeUpdate();
            return r;
            
        }catch(SQLException ex){
            return 0;
            
        }
    }
    
    // Metodo para alterar o registro cujo id foi informado
    public int salvarAlteracao(Cliente cli){
        try{
            st = con.prepareStatement("update cliente set nome=?, telefone=?, sexo=?, renda=?, where id=?");
            st.setString(1, cli.getNome());
            st.setString(2, cli.getTelefone());
            st.setString(3, cli.getSexo());
            st.setDouble(4, cli.getRenda());
            st.setInt(5, cli.getId());
            
            int r = st.executeUpdate();
            
            return r;
            
        }catch(SQLException ex){
            return 0;
        }
    }
}
