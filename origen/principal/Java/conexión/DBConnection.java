package connection;

import java.sql.Connection;

public class DBConnection {

	Connection connection;
		
	static String bd = "adoptante";
	static String port = "3306";
	static String login = "root";
	static String password = "admin";
	
	public DBConnection () {
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
			connection = DriverManager.getConecction(url,this.login,this.password);
			System.out.println("Conexión establecida");
		} catch (Exception ex) {
			System.out.println("Error de conexión");
		}
		
	}
	
	public Connection getConection() {
		return connection;	
	}
	
	public void desconectar() {
		connection = null;
	}
	
}
