package Contenedor;

import Interfaz.SupervisorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.MysqlConnection;

import Clase.Supervisor;
import Conexion.MySqlConexion;

public class MySqlSupervisorDAO implements SupervisorDAO {
	

	@Override
	public int registrarsupervisor(Supervisor sup) {
		System.out.print("Registrado Correctamente");
		int salida=-1;
		Connection conn=null;
		PreparedStatement pstm=null;
		try {
		conn=MySqlConexion.getConexion();
			String sql;
			//PASO 1: obtener conexion a base de datos
			conn=MySqlConexion.getConexion();
			//PASO 2: instrucción SQL INSERT INTO (asignar parámetros "?")
				sql="insert into tb_supervisor values(?,?,?,?,?)";
			//PASO 3: crear objeto pstm y enviar la instrucción sql		
				pstm=conn.prepareStatement(sql);
			//Paso 4 Parámetros de la instrucción SQL que maneja el objeto pst
//				pstm.setString(1,bean.getCodsuper());
				pstm.setInt(1, sup.getCodsuper());
				pstm.setString(2, sup.getNomsuper());
				pstm.setString(3, sup.getApesuper());
				pstm.setInt(4, sup.getDnisuper());
				pstm.setInt(5, sup.getCelsuper());
				//PASO 5: Ejecutar Intrucción SQL que maneja el objeto pstm
				salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally { 
		try {
		
			if(pstm!=null)pstm.close();
			if(conn!=null)conn.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
		return salida;
		
		
		
		
	
	}

	@Override
	public int actualizarsupervisor(Supervisor sup) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarsupervisor(Supervisor sup) {
		// TODO Auto-generated method stub
		return 0;
	}
}




