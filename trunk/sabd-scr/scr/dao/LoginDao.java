package scr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import scr.entidades.Usuario;

public class LoginDao extends JdbcManager {
	public Usuario buscarPorNombreYPass(String nombre, String password){ 
		Connection conn = null;
		ResultSet rs = null;
		Usuario usr = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT * FROM usuario u" +
				"WHERE u.uoNombre = ? and u.uoPassword = ? ";
		
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(0, nombre);
		pStatement.setString(1, password);
		rs = pStatement.executeQuery();		
		
		if(rs.next()){
			usr = this.rellenarUsuario(rs);	
		}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
		return usr;
	}
	
	private Usuario rellenarUsuario(ResultSet rs) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setId(rs.getInt(0));
		usuario.setNombre(rs.getString(1));
		usuario.setIdRol(rs.getInt(2));
		return usuario;
		
	}

}
