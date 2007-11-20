package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import scr.entidades.Provincia;

public class ProvinciaDao extends JdbcManager {
	
	@SuppressWarnings("finally")
	public Collection<Provincia> buscarTodos(){
		ResultSet rs = null;
		Connection con = null;
		Collection<Provincia> provincias = new ArrayList<Provincia>();
		try{
			con = this.getDB2ConnectionFromProperties();
			
			/**
			 * TODO: SELECT PARA BUSCAR TODAS LAS PROVINCIAS
			 */
			
			PreparedStatement cs = con.prepareCall("SP_GET_PROVINCIAS()");
			rs = cs.executeQuery();
			while(rs.next()){
				provincias.add(this.rellenarProvincia(rs));
			}
		}catch(SQLException sqlex){
			System.out.println("Can not retrive Provincias, cause: " + sqlex.getMessage());
			return null;
		}
		catch(Exception ex){
			System.out.println("Error, cause: " + ex.getMessage());
			return null;
		}finally{
			cerrarConexion(con,rs);
			return provincias;
		}
	}
	
	private Provincia rellenarProvincia(ResultSet rs) throws SQLException{
		Provincia provincia = new Provincia();
		provincia.setId(rs.getInt(0));
		provincia.setIdPais(rs.getInt(1));
		provincia.setNombre(rs.getString(2));
		return provincia;
	}
}
