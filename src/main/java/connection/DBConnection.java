/** Paquete para hacer la conexión con la base de datos **/

package connection;

import java.sql.Connection;
import java.sql.DriverManager;




public class DBConnection {
    Connection  connection;
    static String bd = "railway";
    static String  port = "6297";
    static String  login = "root";
    static String  password = "tTkWux5VPC9OmDieCoKP";
    static String  ip = "containers-us-west-34.railway.app";
            
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + DBConnection.ip + ":" + DBConnection.port + "/" + DBConnection.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexion Exitosa");
            
        } catch (Exception ex) {
            System.out.println("Error en la conecion " + ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }
 
}
