package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConexion {

	public static Connection getConexion() {
		Connection cn=null;
		try {
			//Carga de la clase Driver que se encuentra en jar
			Class.forName("com.mysql.cj.jdbc.Driver");
			//variables
			String url, user,pass;
			//
			url="jdbc:mysql://localhost/Consorcio_2022?serverTimezone=UTC";
			user="root";
			pass="mysql";
			//Crear objeto cn
			cn=DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException e)	{
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {e.printStackTrace();}
		return cn;
	}
	
	
	
	
	
	
	
	
	
	
	
}
