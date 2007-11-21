package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Condicion;

public class CondicionDao extends JdbcManager {

	public void insertCondicion(Condicion condicion) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO Condicion (cnIdSector, cnDescripcion, cnComparador," +
				" cnDiscriminador, cnInicio) " + 
						"VALUES (?, ?, ?, ?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(0, condicion.getIdSector());
		pStatement.setString(1, condicion.getDescripcion());
		pStatement.setInt(2, condicion.getComparador());
		pStatement.setInt(3, condicion.getDiscriminador());
		pStatement.setInt(4, condicion.getInicio());
		
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

	public Vector<Condicion> getCondiciones(int discriminador) {
		Connection conn = null;
		ResultSet rs = null;
		Vector<Condicion> vec = new Vector<Condicion>();
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT * FROM Condicion c ";
		
		if(discriminador == 0){
			query += "WHERE c.cnDiscriminador == 0 ";
		} else if(discriminador == 1){
			query += "WHERE c.cnDiscriminador == 1 ";
		}
        
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(query);
		while(rs.next()){
			vec.add(this.rellenarCondicion(rs));
		}
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

	private Condicion rellenarCondicion(ResultSet rs) throws SQLException {
		Condicion condicion = new Condicion();
		condicion.setId(rs.getInt(0));
		condicion.setIdSector(rs.getInt(1));
		condicion.setDescripcion(rs.getString(2));
		condicion.setComparador(rs.getInt(3));
		condicion.setDiscriminador(rs.getInt(4));
		condicion.setInicio(rs.getInt(5));
		return condicion;
	}

}
