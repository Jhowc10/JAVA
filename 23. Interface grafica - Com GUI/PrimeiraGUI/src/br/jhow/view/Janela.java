/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.jhow.view;

// É preciso importar o API do swing
import javax.swing.JFrame;

/**
 *
 * @author tatia
 */
public class Janela {
    
    //Cria um objeto JFrame chamado ' janela '
    JFrame janela = new JFrame();
    
    // Construtor da classe, que gera um objeto de tela (jFrame)
    public Janela(){
        janela.setTitle("Minha primeira tela em Java!");       // Titulo da janela
        janela.setSize(800, 600);                              // Largura e a altura da janela em pixels
        //janela.setLocation(100, 150);                        // Define a posição da janela, coluna e linha, se retirar esta linha...
        janela.setLocationRelativeTo(null);                    // ... e acrescentar esta, a janela fica centralizada
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ao fechar, encerra a aplicação
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);        // Deixa a tela do tamanho do monitor, independete do tamanho da tela, só coloque se quiser isso
    } 
    
    // Método para msrar a Janela
    public void mostraJanela(){
        janela.setVisible(true);  // Torna a janela visivel
    }
}
