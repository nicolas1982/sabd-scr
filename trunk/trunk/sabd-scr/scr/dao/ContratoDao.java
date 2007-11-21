package scr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Contrato;

public class ContratoDao extends JdbcManager {
	
	public Vector<Contrato> getContratos(){
		Connection conn = null;
		ResultSet rs = null;
		Vector<Contrato> vec = null; 
//		try {
//		conn = this.getDB2ConnectionFromProperties();
//		
//		String query = "SELECT * FROM Contrato ";
//        
//		Statement statement = conn.createStatement();
//		rs = statement.executeQuery(query);		
//		
//		vec = this.buildContratosFromResultSet(rs);
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
//		return vec;
		vec = new Vector<Contrato>();
		Contrato contrato = new Contrato();
		contrato.setId(1);
		contrato.setNombre("contrato1");
		contrato.setIdTarifa(1);
		vec.add(contrato);
		contrato = new Contrato();
		contrato.setId(2);
		contrato.setNombre("contrato2");
		contrato.setIdTarifa(2);
		vec.add(contrato);
		return vec;
	}

	private Vector<Contrato> buildContratosFromResultSet(ResultSet rs) throws SQLException {
		Vector<Contrato> vec = new Vector<Contrato>();
		Contrato contrato = null;
		while(rs.next()){
			contrato = new Contrato();
			contrato.setId(rs.getInt(0));
			contrato.setNombre(rs.getString(1));
			contrato.setIdTarifa(rs.getInt(2));
			vec.add(contrato);
		}
		return vec;
	}
	
	

}
