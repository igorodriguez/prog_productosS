package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Igor
 *
 */

public class Conector {

	protected Connection conexion;

	/**
	 */
	protected Conector() {
			try {			
				Class.forName("com.mysql.jdbc.Driver");
				this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD, Config.USERNAME, Config.PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	/**
	 * 
	 * @return
	 */
	public Connection getConexion() {
		return conexion;
	}
	/**
	 * 
	 * @param conexion
	 */

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}