package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Productor;

public class ProductorDao extends JdbcManager {
	public Vector<Productor> getProductores(){
		Connection conn = null;
		ResultSet rs = null;
		Vector<Productor> vec = null;
//		try {
//		conn = this.getDB2ConnectionFromProperties();
//		
//		String query = "SELECT pridproductor, priddomicilio, prnombre FROM productor";
//        
//		Statement statement = conn.createStatement();
//		rs = statement.executeQuery(query);		
//		
//		vec = this.buildProductoresFromResultSet(rs);
//		
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			this.cerrarConexion(conn,rs);
//		}
		vec = new Vector<Productor>();
        Productor prod = new Productor();
        prod.setIdProductor(1);
        prod.setIdDomicilio(1);
        prod.setNombre("movia");
        vec.add(prod);
        prod = new Productor();
        prod.setIdProductor(2);
        prod.setIdDomicilio(2);
        prod.setNombre("torobia");
        vec.add(prod);
		return vec;
	}
	private Vector<Productor> buildProductoresFromResultSet(ResultSet rs) throws SQLException{
		Vector<Productor> vec = new Vector<Productor>();
		while(rs.next()) {
			vec.add(this.buildProductorFromResultSet(rs));
		}
		return vec;
	}
	private Productor buildProductorFromResultSet(ResultSet rs) throws SQLException {
		Productor productor = new Productor();
		productor.setIdProductor(rs.getInt(1));
		productor.setIdDomicilio(rs.getInt(2));
		productor.setNombre(rs.getString(3));
		return productor;
	}
	
	public Productor getProductorDeUnUsuario(int id) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT p.pridproductor, p.priddomicilio, p.prnombre " +
				"FROM productor as p, usuarios as u " +
				"WHERE u.uoidusuario = " + id + " and " +
				" p.pridProductor = p.uoidProductor";
		
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(query);		
		
		return this.buildProductorFromResultSet(rs);
		
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
	
	public void altaProductor(Productor productor) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO Productor (prIdDomicilio, prNombre) " + 
						"VALUES (?, ?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(0, productor.getIdDomicilio());
		pStatement.setString(1, productor.getNombre());
		
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
