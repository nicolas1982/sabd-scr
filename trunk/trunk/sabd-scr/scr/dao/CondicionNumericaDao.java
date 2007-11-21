package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scr.entidades.CondicionNumerica;

public class CondicionNumericaDao extends JdbcManager {

	public void insertCondicionNumerica(CondicionNumerica condicionNumerica) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO CondicionNumerica (cnaValorCondicion, cnaIdTipoCondNum) " + 
						"VALUES (?, ?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setFloat(0, condicionNumerica.getValorCondicion());
		pStatement.setInt(1, condicionNumerica.getTipoCondicionNum());
		
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
