package org.senai.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection conectar() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://chunee.db.elephantsql.com:5432/bsbsjsgu";
			String usuarioDb = "bsbsjsgu";
			String senhaDb = "NhJC-JvRCAKdFPInvYlYrnbLB3sq9sap";
			return DriverManager.getConnection(url, usuarioDb, senhaDb);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro de conexão");
			e.printStackTrace();
			return null;
			
		}
		
	}
}
