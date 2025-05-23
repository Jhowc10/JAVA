/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.jhow.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author tatia
 */
// Nossa classe Tela2 é um jFrame, por isso o extends
public class Tela2 extends JFrame {
    
    // Atributos locais
    private JLabel lblNome, lblRenda;
    private JTextField txtNome, txtRenda;
    private JButton btnSalvar, btnSair;
    
    // Construtor
    public Tela2(){
        
        // Define o leyout como nulo (nós vamos o definir)
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Ao fechar, encerra o programa
        
        // Propriedades do jFrame
        setSize(600, 200);                 // Tamanho
        setLocation(200, 300);             // Posição
        setTitle("Controle de Clientes");  // Titulo
        
        // Propriedades dos campos do formulário
        lblNome = new JLabel("Nome: ");
        lblNome.setSize(50, 30);
        lblNome.setLocation(30, 10);
        add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setSize(480, 30);
        txtNome.setLocation(80, 10);
        add(txtNome);
        
        lblRenda = new JLabel("Renda: ");
        lblRenda.setSize(50, 30);
        lblRenda.setLocation(30, 45);
        add(lblRenda);
        
        txtRenda = new JTextField();
        txtRenda.setSize(100, 30);
        txtRenda.setLocation(80, 45);
        add(txtRenda);
        
        btnSalvar = new JButton("Salvar");
        btnSalvar.setSize(80, 30);
        btnSalvar.setLocation(30, 90);
        add(btnSalvar);
        
        btnSair = new JButton("Salvar");
        btnSair.setSize(80,30);
        btnSair.setLocation(120, 90);
        add(btnSair);
    }   
}
