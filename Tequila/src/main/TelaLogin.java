package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	private JFrame frame;
	private JTextField txt_login;
	private JTextField txt_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 34, 174, 38);
		panel.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(25, 99, 174, 38);
		panel.add(lblSenha);
		
		txt_login = new JTextField();
		txt_login.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_login.setBounds(209, 34, 287, 38);
		panel.add(txt_login);
		txt_login.setColumns(10);
		
		txt_senha = new JTextField();
		txt_senha.setFont(new Font("Arial", Font.PLAIN, 20));
		txt_senha.setColumns(10);
		txt_senha.setBounds(209, 99, 287, 38);
		panel.add(txt_senha);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 166, 495, 63);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_login.getText().equals("elton") == true) {
					if(txt_senha.getText().trim().equals("1234") == true) {
						//JOptionPane.showMessageDialog(null, "Logado com sucesso!!!");	
						Aplicativo aplicativo = new Aplicativo();
						aplicativo.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Senha errada tente novamente mais tarde!!!");
					}					
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_1.add(btnNewButton_1);
	}
}
