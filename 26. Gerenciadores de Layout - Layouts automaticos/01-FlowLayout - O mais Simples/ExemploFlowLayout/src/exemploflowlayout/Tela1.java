/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploflowlayout;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author tatia
 */
public class Tela1 extends JFrame{
    
    // Propriedades da classe
    private JLabel lblNome, lblRenda;
    private JTextField txtNome, txtRenda;
    private JButton btnSalvar, btnSair;
    
    
    // Construtor da classe
    public Tela1(){
        setTitle("Exemplo de Flow layout");    // Altera o titulo da janela
        
        // Cria um objeto de FlowLayout
        FlowLayout fl = new FlowLayout();        // Instancia
        fl.setAlignment(FlowLayout.LEFT);       // Seta o alinhamento
        
        setLayout(fl);                           // Define que o gerenciador do layout será Flowlayout criado
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Define o que ocorre ao fechar a tela
        setSize(590, 200);                       // Seta o tamanho
        setLocation(100, 200);                   // Sta a posição da tela
        
        
        // Cria os componentes e adiciona
        lblNome = new JLabel("Nome ");
        add(lblNome);
        
        txtNome = new JTextField(45);    // Para 45 caracteres
        add(txtNome);
        
        lblRenda = new JLabel("Renda ");
        add(lblRenda);
        
        txtRenda = new JTextField(15);   // Para 15 caracteres
        add(txtRenda);
        
        btnSalvar = new JButton("Salvar");
        add(btnSalvar);
        
        btnSair = new JButton("Sair");
        add(btnSair);
    }
}
