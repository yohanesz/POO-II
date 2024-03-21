package projetoPOO;

import java.sql.Connection;

import java.sql.DriverManager;

public class Conexao {
	
	private static Conexao conn;
	
	private Conexao() {
		
		
	}
	
	public static Conexao getInstance() {
		if(conn == null)
		conn = new Conexao();
		return conn;
	}

		
	public static Connection conectar() {
				
			try {
		           Class.forName("com.mysql.cj.jdbc.Driver");
		           String url = "jdbc:mysql://localhost/projetoTrello";
		           return DriverManager.getConnection(url,"admin","adminPassword");
		       } catch (Exception e) {
		           e.printStackTrace();
		           return null;
		      }
		}

}



