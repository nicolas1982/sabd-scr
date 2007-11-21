package scr.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Vector;

import scr.entidades.Sector;

public class SectoresDao extends JdbcManager {
	
	public Vector<Sector> getSectores(){
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
	
	public Vector<Sector> getSectoresByProductor(Integer idProductor){
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT sridsector, sridtipocultivo, sridcontrato, sridcampo, srdescripcion, srfechahorainicio, srfechahorafin, srhectareas FROM sector, campo where sridcampo = coidcampo and coidproductor = "+idProductor;
        
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
	
	private Vector<Sector> buildSectoresFromResultSet(ResultSet rs) throws SQLException{
		Vector<Sector> vec =  new Vector<Sector>();
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
	
//	create function fun_get_estado_riego(idSector integer)
//	returning smallint;
//		define p_ret smallint;
//		call sp_get_estado_riego(idSector) returning p_ret;
//		return p_ret;
//	end function;
	public Short getEstadoRiego(Integer idSector) {
		Connection conn = null;
		Short retValue;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		CallableStatement callableStatement = conn.prepareCall("{call fun_get_estado_riego(?)}");
		
	    // Set the value for the IN parameter
		callableStatement.setInt(1, idSector);
        
		//Execute and retrieve the returned value
		rs = callableStatement.executeQuery();
		if(rs.next()) rs.getShort(1);
			retValue = rs.getShort(1);
		
		//retValue = callableStatement.getShort(1);
		
		return retValue;
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.cerrarConexion(conn,rs);
		}
		return null;
	}

	public void insertSector(Sector sector) {
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "INSERT INTO Sector (srIdTipoCultivo, srIdContrato, srIdCampo, " +
				"srDescripcion, srFechaHoraInicio, srFechaHoraFin) " + 
						"VALUES (?, ?, ?, ?, ?, ?)";	
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setInt(0, sector.getIdTipoCultivo());
		pStatement.setInt(1, sector.getIdcontrato());
		pStatement.setInt(2, sector.getIdcampo());
		pStatement.setString(3, sector.getDescripcion());
		pStatement.setTimestamp(4, sector.getFechahorainicio());
		pStatement.setTimestamp(5, sector.getFechahorafin());
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


