package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scr.entidades.Campo;

public class CampoDao extends JdbcManager {
	
	public void insertCampo(Campo campo) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO Campo (coIdProductor, coIdDomicilio, coNombre, coHectareas) " + 
						"VALUES (?, ?, ?, ?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(0, campo.getIdProductor());
		pStatement.setInt(1, campo.getIdDomicilio());
		pStatement.setString(2, campo.getNombre());
		pStatement.setInt(3, campo.getHectareas());
		
		pStatement.executeUpdate();		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
	}
}
