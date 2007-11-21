package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scr.entidades.CondicionHoraria;

public class CondicionHorariaDao extends JdbcManager {

	public void insertCondicionHoraria(CondicionHoraria condicionHoraria) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO CondicionHoraria (cnValorCondicion) " + 
						"VALUES (?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(0, condicionHoraria.getValorCondicion());
		
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
