package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Productor;

public class ProductorDao extends JdbcManager {
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
	
	public int altaProductor(Productor productor) {
		ResultSet rs = null;
		Connection con = null;
		try{
			con = this.getDB2ConnectionFromProperties();
			
			/**
			 * TODO: INSERT DEL PRODUCTOR
			 */
			
			PreparedStatement cs = con.prepareCall("SP_GET_PROVINCIAS()");
			rs = cs.executeQuery();
		}catch(SQLException sqlex){
			System.out.println("Could not insert Productor, cause: " + sqlex.getMessage());
		}
		catch(Exception ex){
			System.out.println("Error, cause: " + ex.getMessage());
		}finally{
			cerrarConexion(con,rs);
		}
		/**
		 * TODO: ver como devuelvo el id que me acaba de generar la base
		 */
		return 0;
	}
	
	
	
}
