package Aep2_2.Aep2_2;

import java.sql.Connection;
import java.sql.DriverManager;

public class CriarConexao {

	private CriarConexao(){
		
	}
	public static Connection conexao() throws Exception {
		Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/3esoft2019",
				"postgres",
				"unicesumar");
		return conn;
	}
}
