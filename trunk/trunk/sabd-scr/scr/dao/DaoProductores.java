package scr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Productor;

public class DaoProductores extends JdbcManager {
	public Vector getProductores(){
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT pridproductor, priddomicilio, prnombre FROM productor";
        
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(query);		
		
		return this.buildProductoresFromResultSet(rs);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
		return null;
	}
	private Vector buildProductoresFromResultSet(ResultSet rs) throws SQLException{
		Vector vec = new Vector();
		Productor productor;
		
		while(rs.next()) {
			productor = new Productor();
			productor.setIdProductor(rs.getInt(1));
			productor.setIdDomicilio(rs.getInt(2));
			productor.setNombre(rs.getString(3));
			vec.add(productor);
		}
		return vec;
	}
	
	
}
