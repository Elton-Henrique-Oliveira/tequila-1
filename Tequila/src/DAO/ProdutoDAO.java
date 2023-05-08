package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.ProdutoDTO;

public class ProdutoDAO {

	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	String sql = "";
	
	ArrayList<ProdutoDTO> lista = new ArrayList<>();
	
	public void cadastrarProduto(ProdutoDTO objprodutodto) {

		sql  = "insert into produtos";
		sql += "	(produto_nome,produto_preco,produto_peso,produto_custo)";
		sql += " values";
		sql += " 	(?,?,?,?);";

		conn = new ConexaoDAO().conectaBD();
		try {
			
			pstm = conn.prepareStatement(sql); 
			pstm.setString(1, objprodutodto.getNome_produto());
			pstm.setDouble(2, objprodutodto.getPreco_produto());
			pstm.setDouble(3, objprodutodto.getPeso_produto());
			pstm.setDouble(4, objprodutodto.getCusto_produto());
			pstm.execute();
			pstm.close();
			
		} catch (SQLException error) {
			JOptionPane.showMessageDialog(null, "ProdutosDAO" + error);
		}
	}
	
	public ArrayList<ProdutoDTO> pesquisarProduto (){
		
		sql = "select * from produtos;";
		
		conn = new ConexaoDAO().conectaBD();
		try {
			
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();		
			
			while (rs.next()) {
				ProdutoDTO objprodutodto = new ProdutoDTO();
				objprodutodto.setCodigo_produto(rs.getInt("produto_codigo"));
				objprodutodto.setNome_produto(rs.getString("produto_nome"));
				objprodutodto.setPreco_produto(rs.getDouble("produto_preco"));
				objprodutodto.setCusto_produto(rs.getDouble("produto_custo"));
				objprodutodto.setPeso_produto(rs.getDouble("produto_peso"));
				lista.add(objprodutodto);
			}
					
		} catch (SQLException error) {
			JOptionPane.showMessageDialog(null, "ProdutoDAO Pesquisar" + error);
		}
		
		return lista;
	}
}
