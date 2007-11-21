package scr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.TipoCultivo;

public class TipoCultivoDao extends JdbcManager {

	public Vector<TipoCultivo> getTiposCultivo() {
		Connection conn = null;
		ResultSet rs = null;
		Vector<TipoCultivo> vec = null;
		try {
			conn = this.getDB2ConnectionFromProperties();
			
			String query = "SELECT * FROM TipoDeCultivo";
	        
			Statement statement = conn.createStatement();
			rs = statement.executeQuery(query);		
			
			vec = this.buildTiposCultivoFromResultSet(rs);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
		return vec;
	}

	private Vector<TipoCultivo> buildTiposCultivoFromResultSet(ResultSet rs) throws SQLException {
		Vector<TipoCultivo>vec = new Vector<TipoCultivo>();
		TipoCultivo tipoCultivo = null;
		while(rs.next()){
			tipoCultivo = new TipoCultivo();
			tipoCultivo.setId(rs.getInt(0));
			tipoCultivo.setDescripcion(rs.getString(1));
			tipoCultivo.setFactorAjuste(rs.getFloat(2));
			vec.add(tipoCultivo);
		}
		return vec;
	}


}
