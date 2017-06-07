package br.com.tccprojeto.conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.*;

import org.apache.jasper.tagplugins.jstl.core.Catch;



public class conexao {

	 public static final String usuario="root";
	 public static final String senha="";
	 public static final String url="jdbc:mysql://localhost:3306/tccprojeto";
	
	public static Connection conexao()throws SQLException{
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con=DriverManager.getConnection(url, usuario, senha);
		return con;	
	}
	
	
}
