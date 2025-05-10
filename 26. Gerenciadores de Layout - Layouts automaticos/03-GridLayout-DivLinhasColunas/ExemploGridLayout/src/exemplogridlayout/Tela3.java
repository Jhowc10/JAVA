/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplogridlayout;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author tatia
 */
public class Tela3  extends JFrame{
    
    private JLabel lblNome, lblRenda;
    private JTextField txtNome, txtRenda;
    private JButton btnSalvar, btnSair;
    
    // Construtor
    public Tela3(){
        
        setTitle("Exemplo com GridLayout");        // Titulo da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));          // Numero de células (linhas x colunas)
        setSize(600, 200);                        // Tamanho da tela
        setLocation(30, 200);                     // Posição da tela
        
        // Campos
        lblNome = new JLabel("Nome");
        add(lblNome);
        
        txtNome = new JTextField();
        add(txtNome);
        
        lblRenda = new JLabel("Renda");
        add(lblRenda);
        
        txtRenda = new JTextField();
        add(txtRenda);
        
        btnSalvar = new JButton("Salvar");
        add(btnSalvar);
        
        btnSair = new JButton("Sair");
        add(btnSair);   
    }
}
