package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;

public class Aplicativo {

	private JFrame frame;
	private JTextField txt_nome_pesquisa;
	private JTextField txt_cpf_pesquisa;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_consulta_entradas;
	private JTextField txt_cpf_bar;
	private JLabel lbl_nome_cliente;
	private JTextField txt_quantidade_produto;
	private JTextField txt_quantidade_combo;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicativo window = new Aplicativo();
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
	public Aplicativo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(100, 100, 1265, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel jp_entrada = new JPanel();
		tabbedPane.addTab("Entrada", null, jp_entrada, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, " Consulta de entradas", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "  Registro de entrada", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Nome");
		lblNewLabel_4.setBounds(31, 27, 51, 24);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setBounds(31, 85, 51, 24);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefone");
		lblNewLabel_2_1.setBounds(31, 150, 76, 24);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Pacote");
		lblNewLabel_3_1.setBounds(31, 212, 62, 24);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1_1.add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_5.setBounds(129, 152, 354, 27);
		textField_5.setColumns(10);
		panel_1_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_6.setBounds(129, 87, 354, 27);
		textField_6.setColumns(10);
		panel_1_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_7.setBounds(129, 29, 354, 27);
		textField_7.setColumns(10);
		panel_1_1.add(textField_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 275, 450, 97);
		panel_1_1.add(panel_2);
		
		JButton btnNewButton = new JButton("ENTRADA");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 25));
		
		JButton btnNewButton_1 = new JButton("SAIDA");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 25));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(71)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox.setBounds(131, 212, 352, 27);
		panel_1_1.add(comboBox);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(31, 27, 51, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(31, 62, 51, 24);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txt_cpf_pesquisa = new JTextField();
		txt_cpf_pesquisa.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_cpf_pesquisa.setBounds(129, 64, 354, 27);
		panel_1.add(txt_cpf_pesquisa);
		txt_cpf_pesquisa.setColumns(10);
		
		txt_nome_pesquisa = new JTextField();
		txt_nome_pesquisa.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_nome_pesquisa.setBounds(129, 29, 354, 27);
		panel_1.add(txt_nome_pesquisa);
		txt_nome_pesquisa.setColumns(10);
		
		table_consulta_entradas = new JTable();
		table_consulta_entradas.setFont(new Font("Arial", Font.PLAIN, 20));
		table_consulta_entradas.setBounds(31, 148, 524, 252);
		panel_1.add(table_consulta_entradas);
		GroupLayout gl_jp_entrada = new GroupLayout(jp_entrada);
		gl_jp_entrada.setHorizontalGroup(
			gl_jp_entrada.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp_entrada.createSequentialGroup()
					.addGap(21)
					.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
					.addGap(87)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE))
		);
		gl_jp_entrada.setVerticalGroup(
			gl_jp_entrada.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp_entrada.createSequentialGroup()
					.addGroup(gl_jp_entrada.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp_entrada.createSequentialGroup()
							.addGap(23)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jp_entrada.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		JButton btnNewButton_2 = new JButton("BUSCAR");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_2.setBounds(31, 97, 524, 36);
		panel_1.add(btnNewButton_2);
		jp_entrada.setLayout(gl_jp_entrada);
		
		JPanel jp_bar = new JPanel();
		tabbedPane.addTab("Bar", null, jp_bar, null);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txt_cpf_bar = new JTextField();
		txt_cpf_bar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txt_cpf_bar.getText().trim().equals("1055") == true) {
					lbl_nome_cliente.setText("Elton Henrique");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				if(txt_cpf_bar.getText().trim().equals("1055") == true) {
					lbl_nome_cliente.setText("Elton Henrique");
				}
			}
		});
		txt_cpf_bar.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_cpf_bar.setColumns(10);
		
		lbl_nome_cliente = new JLabel("");
		lbl_nome_cliente.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Produtos", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		GroupLayout gl_jp_bar = new GroupLayout(jp_bar);
		gl_jp_bar.setHorizontalGroup(
			gl_jp_bar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp_bar.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_jp_bar.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 1191, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jp_bar.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txt_cpf_bar, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lbl_nome_cliente, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_jp_bar.setVerticalGroup(
			gl_jp_bar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jp_bar.createSequentialGroup()
					.addGroup(gl_jp_bar.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jp_bar.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_jp_bar.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(txt_cpf_bar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_jp_bar.createSequentialGroup()
							.addGap(27)
							.addComponent(lbl_nome_cliente, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_3 = new JLabel("Produto");
		lblNewLabel_3.setBounds(16, 35, 73, 39);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Combos");
		lblNewLabel_3_2_1.setBounds(16, 85, 73, 39);
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JButton btnNewButton_3 = new JButton("ADICIONAR");
		btnNewButton_3.setBounds(83, 294, 288, 45);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);
		
		txt_quantidade_produto = new JTextField();
		txt_quantidade_produto.setBounds(93, 36, 54, 38);
		txt_quantidade_produto.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_quantidade_produto.setColumns(10);
		
		JComboBox txt_combo_venda = new JComboBox();
		txt_combo_venda.setBounds(153, 85, 293, 39);
		txt_combo_venda.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_combo_venda.setModel(new DefaultComboBoxModel(new String[] {"", "10 - Mata fome", "11 - Volta ao mundo"}));
		
		JComboBox txt_produto_venda = new JComboBox();
		txt_produto_venda.setBounds(153, 35, 293, 39);
		txt_produto_venda.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_produto_venda.setModel(new DefaultComboBoxModel(new String[] {"", "Cachorro-quente", "Hamburguer"}));
		
		JLabel lblNewLabel_5 = new JLabel("Total dos itens");
		lblNewLabel_5.setBounds(16, 188, 145, 29);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lbl_valor_total = new JLabel("");
		lbl_valor_total.setBounds(179, 188, 267, 29);
		lbl_valor_total.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txt_quantidade_combo = new JTextField();
		txt_quantidade_combo.setBounds(93, 85, 54, 38);
		txt_quantidade_combo.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_quantidade_combo.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Calcular");
		btnNewButton_4.setBounds(93, 139, 269, 38);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int item1 = 10;
				int item2 = 20;
				
				double soma = 0;
				
				if(txt_quantidade_produto.getText().trim().equals("") == false) {
					soma += item1 * Integer.parseInt(txt_quantidade_produto.getText());
				}
				if(txt_quantidade_combo	.getText().trim().equals("") == false) {
					soma += item2 * Integer.parseInt(txt_quantidade_combo.getText());	
				}
				lbl_valor_total.setText(""+soma);
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.add(btnNewButton_3);
		panel_3.add(lblNewLabel_5);
		panel_3.add(lbl_valor_total);
		panel_3.add(lblNewLabel_3);
		panel_3.add(lblNewLabel_3_2_1);
		panel_3.add(txt_quantidade_produto);
		panel_3.add(txt_quantidade_combo);
		panel_3.add(txt_combo_venda);
		panel_3.add(txt_produto_venda);
		panel_3.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(552, 11, 629, 368);
		panel_3.add(textField);
		textField.setColumns(10);
		jp_bar.setLayout(gl_jp_bar);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Comandas", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Produtos", null, panel_4, null);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1244, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 478, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
