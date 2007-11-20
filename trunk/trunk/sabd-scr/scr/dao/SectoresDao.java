package scr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Productor;
import scr.entidades.Sector;

public class SectoresDao extends JdbcManager {
	
	public Vector getSectores(){
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT sridsector, sridtipocultivo, sridcontrato, sridcampo, srdescripcion, srfechahorainicio, srfechahorafin, srhectareas FROM sector";
        
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(query);		
		
		return this.buildSectoresFromResultSet(rs);
		
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
	
	public Vector getSectoresByProductor(Integer idProductor){
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT sridsector, sridtipocultivo, sridcontrato, sridcampo, srdescripcion, srfechahorainicio, srfechahorafin, srhectareas FROM sector where sridcampo = coidcampo and coidproductor = pridproductor and pridproductor = idProductor";
        
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(query);		
		
		return this.buildSectoresFromResultSet(rs);
		
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
	
	private Vector buildSectoresFromResultSet(ResultSet rs) throws SQLException{
		Vector vec = new Vector();
		Sector sector;
		
		while(rs.next()) {
			sector = new Sector();
			sector.setIdsector(rs.getInt(1));
			sector.setIdTipoCultivo(rs.getInt(2));
			sector.setIdcontrato(rs.getInt(3));
			sector.setIdcampo(rs.getInt(4));
			sector.setDescripcion(rs.getString(5));
			sector.setFechahorainicio(rs.getTimestamp(6));
			sector.setFechahorafin(rs.getTimestamp(7));
			
			vec.add(sector);
		}
		return vec;
	}
	
	
}

