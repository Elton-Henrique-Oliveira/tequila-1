package cadastro_produtos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JFormattedTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;

public class Cadastro {

	private JFrame frame;
	private JTable tabela_produtos;
	private JTextField txt_produto_adicionar;
	private JTextField txt_produto_valor;
	private JTextField txt_produto_peso;
	private JFormattedTextField txt_custo_produto;
	private JTable tabela_combos;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox cb_produto_combo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
		listaProdutos();
		montaProdutoCombo();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 914, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Produtos", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaProdutos();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(301, 18, 240, 30);
		panel.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 873, 427);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		tabela_produtos = new JTable();
		tabela_produtos.setBounds(138, 54, 585, 362);
		panel_4.add(tabela_produtos);
		tabela_produtos.setSurrendersFocusOnKeystroke(true);
		tabela_produtos.setShowVerticalLines(false);
		tabela_produtos.setShowHorizontalLines(false);
		tabela_produtos.setShowGrid(false);
		tabela_produtos.setColumnSelectionAllowed(true);
		tabela_produtos.setFillsViewportHeight(true);
		tabela_produtos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabela_produtos.setBackground(SystemColor.inactiveCaptionBorder);
		tabela_produtos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Produto", "Pre\u00E7o venda", "Custo", "Peso"
			}
		));
		tabela_produtos.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Combos", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 873, 427);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		tabela_combos = new JTable();
		tabela_combos.setSurrendersFocusOnKeystroke(true);
		tabela_combos.setShowVerticalLines(false);
		tabela_combos.setShowHorizontalLines(false);
		tabela_combos.setShowGrid(false);
		tabela_combos.setFont(new Font("Arial", Font.PLAIN, 15));
		tabela_combos.setFillsViewportHeight(true);
		tabela_combos.setColumnSelectionAllowed(true);
		tabela_combos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabela_combos.setBackground(SystemColor.inactiveCaptionBorder);
		tabela_combos.setBounds(133, 58, 585, 358);
		panel_5.add(tabela_combos);
		
		JButton btnNewButton_1 = new JButton("Listar");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_1.setBounds(286, 11, 240, 30);
		panel_5.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Cadastro de produtos", null, panel_2, null);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setBounds(235, 44, 88, 34);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor");
		lblNewLabel_1_1.setBounds(235, 89, 88, 34);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txt_produto_adicionar = new JTextField();
		txt_produto_adicionar.setBounds(333, 44, 279, 34);
		txt_produto_adicionar.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_produto_adicionar.setColumns(10);
		
		txt_produto_valor = new JTextField();
		txt_produto_valor.setBounds(333, 89, 279, 34);
		txt_produto_valor.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_produto_valor.setColumns(10);
		
		JButton btn_adicionar_produto = new JButton("Cadastrar");
		btn_adicionar_produto.setBounds(333, 246, 205, 45);
		btn_adicionar_produto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome;
				double preco,peso,custo;
				

				try {
					nome = txt_produto_adicionar.getText();
					peso = Double.parseDouble(txt_produto_peso.getText().replaceAll(",", "."));
					preco = Double.parseDouble(txt_produto_valor.getText().replaceAll(",", "."));
					custo = Double.parseDouble(txt_custo_produto.getText().replaceAll(",", "."));
					
					ProdutoDTO objprodutodto = new ProdutoDTO();
					objprodutodto.setNome_produto(nome);
					objprodutodto.setPeso_produto(peso);
					objprodutodto.setPreco_produto(preco);
					
					ProdutoDAO objprodutodao = new ProdutoDAO();
					objprodutodao.cadastrarProduto(objprodutodto);
					
					txt_produto_adicionar.setText("");
					txt_produto_peso.setText("");
					txt_produto_valor.setText("");
					txt_custo_produto.setText("");
					
				} catch (Exception error2) {
					JOptionPane.showMessageDialog(null, error2);
				}
			}
		});
		btn_adicionar_produto.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Custo");
		lblNewLabel_1_1_1.setBounds(235, 134, 88, 34);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txt_produto_peso = new JTextField();
		txt_produto_peso.setBounds(333, 179, 279, 34);
		txt_produto_peso.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_produto_peso.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Peso");
		lblNewLabel_1_1_1_1.setBounds(235, 179, 88, 34);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txt_custo_produto = new JFormattedTextField();
		txt_custo_produto.setBounds(333, 134, 279, 34);
		txt_custo_produto.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_custo_produto.setColumns(10);
		panel_2.setLayout(null);
		panel_2.add(lblNewLabel_1_1_1_1);
		panel_2.add(txt_produto_peso);
		panel_2.add(lblNewLabel_1);
		panel_2.add(txt_produto_adicionar);
		panel_2.add(lblNewLabel_1_1);
		panel_2.add(txt_produto_valor);
		panel_2.add(lblNewLabel_1_1_1);
		panel_2.add(btn_adicionar_produto);
		panel_2.add(txt_custo_produto);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cadastro de combos", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Combo");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(244, 21, 88, 34);
		panel_3.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Valor");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(244, 66, 88, 34);
		panel_3.add(lblNewLabel_1_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(342, 66, 279, 34);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(342, 21, 279, 34);
		panel_3.add(textField_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Produtos");
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(244, 111, 88, 34);
		panel_3.add(lblNewLabel_1_1_2_1);
		
		cb_produto_combo = new JComboBox();
		cb_produto_combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
			}
		});
		cb_produto_combo.setBounds(342, 111, 279, 39);
		panel_3.add(cb_produto_combo);
	}
	
	private void montaProdutoCombo () {
		try {
			ProdutoDAO objProdutoDAO = new ProdutoDAO();
			
			DefaultTableModel model = (DefaultTableModel) tabela_produtos.getModel();
			model.setNumRows(0);
			
			ArrayList<ProdutoDTO> lista = objProdutoDAO.pesquisarProduto();

			cb_produto_combo.removeAllItems();
			
			for(int i = 0; i < lista.size(); i ++){
				cb_produto_combo.addItem(lista.get(i).getNome_produto());
			}
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null,"Listar valores" +  error);
		}
	}
	
	private void listaProdutos () {
		try {
			ProdutoDAO objProdutoDAO = new ProdutoDAO();
			
			DefaultTableModel model = (DefaultTableModel) tabela_produtos.getModel();
			model.setNumRows(0);
			
			ArrayList<ProdutoDTO> lista = objProdutoDAO.pesquisarProduto();

			model.addRow(new Object[] {
					"",
					"",
					"",
					"",
					"",
				});
			
			for(int i = 0; i < lista.size(); i ++){
				model.addRow(new Object[] {
						"   " + lista.get(i).getCodigo_produto(),
						"   " + lista.get(i).getNome_produto(),
						"   " + lista.get(i).getPreco_produto(),
						"   " + lista.get(i).getCusto_produto(),
						"   " + lista.get(i).getPeso_produto(),
					});
			}
			
		} catch (Exception error) {
			JOptionPane.showMessageDialog(null,"Listar valores" +  error);
		}
	}
}
