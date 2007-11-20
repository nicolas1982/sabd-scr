package scr.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import scr.entidades.Productor;

public class DaoFacturacion extends JdbcManager {
	public int generarFactura(String fecha, Productor productor) {
		Connection conn = null;
		int idFactura = 0;
		try {
			conn = this.getDB2ConnectionFromProperties();
			
			String query = "{call func_fac_prod[?,?,?]";
	        
			CallableStatement cs = conn.prepareCall(query);
			cs.setString(1,fecha);
			cs.setInt(2,productor.getIdProductor());
			cs.registerOutParameter(3,Types.INTEGER);
			cs.execute();
			this.cerrarConexion(conn);
			idFactura = cs.getInt(3);			
			return idFactura;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				this.cerrarConexion(conn);
			}
			return 0;
	}

}
