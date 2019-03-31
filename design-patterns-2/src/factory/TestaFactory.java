package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestaFactory {
	
	public static void main(String[] args) throws Exception {
		
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
		Connection c = new ConnectionFactory().getConnection();
		
		PreparedStatement sql = c.prepareStatement("select * from tabela");
		
		//...
		
	}
}
