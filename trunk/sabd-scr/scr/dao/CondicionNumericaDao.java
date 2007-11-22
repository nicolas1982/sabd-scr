package scr.dao;

import java.sql.CallableStatement;
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
		/*
		 * TODO: AGREGAR LA FUNCION A LA BASE
		 */
		//String query = "INS INTO CondicionNumerica (cnaValorCondicion, cnaIdTipoCondNum) " + 
		//				"VALUES (?, ?)";	
		String query = "{ ? = call fun_ins_conN(?,?,?)}";
		
		CallableStatement pStatement = conn.prepareCall(query);
		pStatement.setInt(1, condicionNumerica.getId());
		pStatement.setFloat(2, condicionNumerica.getValorCondicion());
		pStatement.setInt(3, condicionNumerica.getTipoCondicionNum());
		
		pStatement.executeUpdate();		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
	}

}
