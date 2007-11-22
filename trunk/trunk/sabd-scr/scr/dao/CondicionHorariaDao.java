package scr.dao;

import java.sql.CallableStatement;
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
		/*
		 * TODO: Agregar esta funcion a la base
		 */
		//String query = "INS INTO CondicionHoraria (cnValorCondicion) " + 
		//				"VALUES (?)";
		
		String query = "{ ? = call fun_ins_conH(?,?)}";
		
		CallableStatement cStatement = conn.prepareCall(query);
		cStatement.setInt(1, condicionHoraria.getId());
		cStatement.setInt(2, condicionHoraria.getValorCondicion());
		
		rs = cStatement.executeQuery();		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
	}
	
}
