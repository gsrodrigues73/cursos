package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		String banco = System.getenv("tipoBanco");
		
		try {
			Connection c = DriverManager.getConnection("jdbc:" + banco + "://localhost/banco", "root", "123");

			return c;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}
}
