package scr.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import scr.entidades.Productor;

public class DaoFacturacion extends JdbcManager {
	public boolean generarFactura(String fecha, Productor productor) {
		Connection conn = null;
		try {
			conn = this.getDB2ConnectionFromProperties();
			String query = this.props.getProperty("func_fac_prod");
			CallableStatement cs = conn.prepareCall(query);
			cs.setString(1,fecha);
			cs.setInt(2,productor.getIdProductor());
			boolean resultado = cs.execute();
			this.cerrarConexion(conn);
			return resultado;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				this.cerrarConexion(conn);
			}
			return false;
	}

}
