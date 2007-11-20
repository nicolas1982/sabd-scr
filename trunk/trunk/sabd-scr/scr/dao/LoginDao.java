package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scr.entidades.Usuario;

public class LoginDao extends JdbcManager {
	public Usuario buscarPorNombre(String nombre){ 
		ResultSet rs = null;
		Connection con = null;
		try{
			con = this.getIDSConnectionFromProperties();
			// Hay que crear este SP
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
		usuario.setIdRol(rs.getString(2));
		return usuario;
	}

}
