package aplicativoeventogui;

// Importações de bibliotecas necesarias
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

// Coo temos eventos, a classe herda de jFrame e implementa a ActionListener
    public class Aplicativo extends JFrame implements ActionListener{
    
    // Atributos locais da classe
    private JPanel pnlCampos, pnlTabela, pnlBotoes, pnlNome, pnlTelefone, pnlCidade;
    private TitledBorder tituloPnlCampos, tituloPnlTabela, tituloPnlBotoes;
    private JLabel lblNome, lblTelefone, lblCidade;
    private JTextField txtNome;
    private JFormattedTextField txtTelefone;
    private MaskFormatter mskTelefone;
    private JTable tblClientes;
    private DefaultTableModel tblClientesModel;
    JButton btnAdicionar, btnLimpar;
    private JComboBox cmbCidades;
    private DefaultComboBoxModel cmbCidadesModel;

    // Construtor que coloca tudo no lugar
    public Aplicativo(){
        definirJanela();                              // Chama o metodo que seta as propriedades da janela
        pnlCampos = new JPanel(new GridLayout(3, 1)); // Um painel para campos
        tituloPnlCampos = BorderFactory.createTitledBorder("Cadastro de Clientes");
        pnlCampos.setBorder(tituloPnlCampos);
        
        
        // Painel para botões
        pnlBotoes = new JPanel(new FlowLayout());
        tituloPnlBotoes = BorderFactory.createTitledBorder("Botões");
        pnlBotoes.setBorder(tituloPnlBotoes);
        
        
        // Painel tabela
        pnlTabela = new JPanel(new GridLayout(1, 1));
        tituloPnlTabela = BorderFactory.createTitledBorder("Tabela de Dados");
        pnlTabela.setBorder(tituloPnlTabela);
        
        
        // Seta os labels
        lblNome = new JLabel("Nome");
        lblTelefone = new JLabel("Telefone");
        lblCidade = new JLabel("Cidade");
        txtNome = new JTextField(50);
        
        
        // Cria um campo de texto com uma máscara para telefone
        try{
            mskTelefone = new MaskFormatter("## #.####.####");
            mskTelefone.setPlaceholderCharacter('_');
            
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Mascara incorreta");
            
        }
        
        txtTelefone = new JFormattedTextField(mskTelefone);
        
        cmbCidadesModel = new DefaultComboBoxModel();
        cmbCidades = new JComboBox(cmbCidadesModel);
        
        
        // Cidades para o combo de seleção
        String cidade1 = "São Paulo";
        String cidade2 = "Rio de Janeiro";
        String cidade3 = "Campinas";
        
        
        // Acrescenta as cidades
        cmbCidadesModel.addElement(cidade1);
        cmbCidadesModel.addElement(cidade2);
        cmbCidadesModel.addElement(cidade3);
        
        
        // Adicionando o campo nome no painel
        pnlNome = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlNome.add(lblNome);        
        pnlNome.add(txtNome);
        pnlCampos.add(pnlNome);
        
        
        // Adicionando o campo telefone ao painel
        pnlTelefone = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlTelefone.add(lblTelefone);
        pnlTelefone.add(txtTelefone);
        pnlCampos.add(pnlTelefone);
        
        // Adicionando o campo cidade no painel
        pnlCidade = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlCidade.add(lblCidade);
        pnlCidade.add(cmbCidades);
        pnlCampos.add(pnlCidade);
        
        
        // Seta os botões
        btnAdicionar = new JButton("Adicionar a tabela");
        btnAdicionar.addActionListener((ActionListener) this);       // Adiciona o Listener no botão
       
        btnLimpar = new JButton("Limpar camos");
        btnLimpar.addActionListener((ActionListener) this);                             // Adicion o Listener a este botão
        
        // Adiciona os botões
        pnlBotoes.add(btnAdicionar);
        pnlBotoes.add(btnLimpar);
        
        
        // Define a tabela
        String[] cols = {"Nome", "Telefone", "Cidade"};
        tblClientesModel = new DefaultTableModel(cols, 3);
        tblClientes = new JTable(tblClientesModel);
        tblClientesModel.setNumRows(0);
        
        
        JScrollPane scrRolagem = new JScrollPane(tblClientes,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnlTabela.add(scrRolagem);
        
        
        
        add(pnlCampos, BorderLayout.NORTH);
        add(pnlBotoes, BorderLayout.CENTER);
        add(pnlTabela, BorderLayout.SOUTH);
    }
    
    
    // Metodo para setar algumas propriedades da janela
    private void definirJanela(){
        setTitle("Aplicação de Cadastro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(800, 700);
        setLocation(200, 80);
    }
    
    
    // Método main
    public static void main(String[] args) {
        Aplicativo ap = new Aplicativo();
        ap.setVisible(true);
    }
    
    
    // Sobrescrita obrigatória da interface ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        /*
        *   A ideia é assim: É um listener para todos os botões.
        *   O Listener deve identificar qual botão foi clicado e disparar uma ação especifica para cada um
        */
        
        
        if(e.getSource() == btnAdicionar){            // Para botão adicionar
            String[] linha = {txtNome.getText(),
                txtTelefone.getText(),
                cmbCidadesModel.getSelectedItem().toString()
            };
            
            tblClientesModel.addRow(linha);
            JOptionPane.showMessageDialog(this, "Dados adicionados", "Feito", JOptionPane.PLAIN_MESSAGE);
            
        }else if(e.getSource() == btnLimpar){        // Para o botão limpar
            int op = JOptionPane.showConfirmDialog(this, "Quer realmente limpar os campos?", "Limpar", 
                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if(op == 0){
                txtNome.setText(null);
                txtTelefone.setText(null);
                cmbCidadesModel.setSelectedItem("São Paulo");
                txtNome.requestFocus();             // Coloca o cursor no txtNome
            }
        }
    }
}
