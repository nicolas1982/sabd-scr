package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import scr.entidades.Pais;

public class PaisDao extends JdbcManager {

	@SuppressWarnings("finally")
	public Collection<Pais> buscarTodos(){
		ResultSet rs = null;
		Connection con = null;
		Collection<Pais> paises = new ArrayList<Pais>();
		try{
			con = this.getDB2ConnectionFromProperties();
			
			/**
			 * TODO: SELECT PARA BUSCAR TODOS LOS PAISES
			 */
			
			PreparedStatement cs = con.prepareCall("SP_GET_PAISES()");
			rs = cs.executeQuery();
			while(rs.next()){
				paises.add(this.rellenarPais(rs));
			}
		}catch(SQLException sqlex){
			System.out.println("Can not retrive Paises, cause: " + sqlex.getMessage());
			return null;
		}
		catch(Exception ex){
			System.out.println("Error, cause: " + ex.getMessage());
			return null;
		}finally{
			cerrarConexion(con,rs);
			return paises;
		}
	}
	
	private Pais rellenarPais(ResultSet rs) throws SQLException{
		Pais pais = new Pais();
		pais.setId(rs.getInt(0));
		pais.setNombre(rs.getString(1));
		return pais;
	}
	
}
