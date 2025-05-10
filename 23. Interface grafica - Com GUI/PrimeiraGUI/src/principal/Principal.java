/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import br.jhow.view.Janela;
import br.jhow.view.Tela2;

/**
 *
 * @author tatia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CHAMANDO APENAS A CLASSE JANELA
        // Cria uma instancia da classe Janela
        // Este trecho de código aciona o construtor da classe Janela
        Janela j = new Janela();
        
        // Dispara o método que torna a Janela visível
        j.mostraJanela();
        
        
        // CHAMANDO O PROGRAMATODO, POIS AO CHAMAR A CLASSE FILHA (TELA2) A CLASSE MÃE TAMBÉM VEM (JANELA)
        // Cria uma instância da classe Tela2
        Tela2 t2 = new Tela2();
        
        // Seta a tela2 como visivel
        t2.setVisible(true);
    }
}
