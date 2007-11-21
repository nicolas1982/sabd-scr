package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Campo;

public class CampoDao extends JdbcManager {
	
	public void insertCampo(Campo campo) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO Campo (coIdProductor, coIdDomicilio, coNombre) " + 
						"VALUES (?, ?, ?, ?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(0, campo.getIdProductor());
		pStatement.setInt(1, campo.getIdDomicilio());
		pStatement.setString(2, campo.getNombre());
		
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

	public Vector<Campo> getCampos() {
		Connection conn = null;
		ResultSet rs = null;
		Vector<Campo> vec = null;
		try {
			conn = this.getDB2ConnectionFromProperties();
			
			String query = "SELECT * FROM Campo";
	        
			Statement statement = conn.createStatement();
			rs = statement.executeQuery(query);		
			
			vec = this.buildCamposFromResultSet(rs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
		return vec;
	}

	private Vector<Campo> buildCamposFromResultSet(ResultSet rs) throws SQLException {
		Vector<Campo> vec = new Vector<Campo>();
		Campo campo = null;
		while(rs.next()){
			campo = new Campo();
			campo.setId(rs.getInt(0));
			campo.setIdProductor(rs.getInt(1));
			campo.setIdDomicilio(rs.getInt(2));
			campo.setNombre(rs.getString(3));
			vec.add(campo);
		}
		return vec;
	}
}
