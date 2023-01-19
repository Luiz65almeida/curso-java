package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o novo nome : ");
		String alteracao = sc.nextLine();
		
		System.out.print("Informe o ID: ");
		int consulta = sc.nextInt();
				
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = ("UPDATE pessoas SET nome = ? WHERE codigo = ?");
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, alteracao);
		stmt.setInt(2, consulta);

		
		stmt.execute();
		
		
		System.out.println("Pessoa alterada com sucesso !");
		sc.close();
		conexao.close();
		stmt.close();
	}

}
