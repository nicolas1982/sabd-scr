package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scr.entidades.Domicilio;

public class DomicilioDao extends JdbcManager {

	public int altaDomicilio(Domicilio domicilio) {
		ResultSet rs = null;
		Connection con = null;
		
		try{
			con = this.getDB2ConnectionFromProperties();
			
			/**
			 * TODO: INSERT DEL DOMICILIO
			 */
			
			PreparedStatement cs = con.prepareCall("SP_GET_PROVINCIAS()");
			rs = cs.executeQuery();
		}catch(SQLException sqlex){
			System.out.println("Can not retrive Provincias, cause: " + sqlex.getMessage());
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
