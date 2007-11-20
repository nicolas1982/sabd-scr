package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scr.entidades.Usuario;

public class LoginDao extends JdbcManager {
	public Usuario buscarPorNombreYPass(String nombre, String pass){ 
		ResultSet rs = null;
		Connection con = null;
		try{
			con = this.getDB2ConnectionFromProperties();
			
			/**
			 * TODO: SELECT PARA BUSCAR USUARIO POR NOMBRE Y PASSWORD
			 */
			
			PreparedStatement cs = con.prepareCall("SP_GET_USUARIOS()");
			cs.setString(1,nombre);
			rs = cs.executeQuery();
			
			if (!rs.next())
				return null;
			return this.rellenarUsuario(rs);
		}catch(SQLException sqlex){
			System.out.println("Can not retrived the user, cause: " + sqlex.getMessage());
			return null;
		}
		catch(Exception ex){
			System.out.println("Error, cause: " + ex.getMessage());
			return null;
		}finally{
			cerrarConexion(con,rs);
		}
	}
	private Usuario rellenarUsuario(ResultSet rs) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setId(rs.getInt(0));
		usuario.setNombre(rs.getString(1));
		usuario.setIdRol(rs.getInt(2));
		return usuario;
	}

}
