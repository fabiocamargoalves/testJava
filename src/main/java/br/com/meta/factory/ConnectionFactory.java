package br.com.meta.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
	
	private static final String DRIVER 	= "org.h2.Driver";
	private static final String URL 	= "jdbc:h2:file:~/testdb";
	private static final String USUARIO = "sa";
	private static final String SENHA 	= "sa";
	
	public Connection createConnection() {
		
		Connection connection = null;
		
		try {
			
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, SENHA);
			
		} catch(Exception e) {
			System.out.println("Error open connetion: " + URL);
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public Connection fecharConexao(Connection connection, PreparedStatement pstmt, ResultSet rs) {
		
		try {
			if(connection!= null) {
				connection.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(rs != null) {
				rs.close();
			}
			
		} catch(Exception e) {
			System.out.println("Error on close connection: " + URL);
			e.printStackTrace();
		}
		
		return connection;
	}	
	
	
}
/*
 * 
 *         SpringApplication.run(Application.class, args);

        CreateH2Database createH2Database = new CreateH2Database();
        createH2Database.create();
 * 
 */
