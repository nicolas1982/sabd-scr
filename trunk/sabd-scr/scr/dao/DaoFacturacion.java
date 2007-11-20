package scr.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.CabeceraFactura;
import scr.entidades.Productor;
import scr.entidades.RenglonFactura;

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

	public CabeceraFactura getCabeceraFactura(String fecha, int idProductor) {
		Connection conn = null;
		try {
        	//Select * from CabeceraFactura where cfaFecha = fecha and cfaIdProductor = idProductor;
            //Select * from RenglonFactura where rfaidcabecerafact = idFactura;
			
			conn = this.getDB2ConnectionFromProperties();
			String query = "Select * from CabeceraFactura where cfaFecha = " + fecha + " and cfaIdProductor = " + idProductor;
			Statement cs = conn.createStatement();
			ResultSet rs = cs.executeQuery(query);
			CabeceraFactura cabecera = this.buildCabeceraFactura(rs);
			this.cerrarConexion(conn);
			return cabecera;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				this.cerrarConexion(conn);
			}
			return null;
	}

	private CabeceraFactura buildCabeceraFactura(ResultSet rs) throws SQLException {
		CabeceraFactura cabecera;
		if (rs.next()){
			cabecera = new CabeceraFactura();
			cabecera.setIdCabecera(rs.getInt(1));
			cabecera.setMontototal(rs.getDouble(2));
			cabecera.setFecha(rs.getDate(3));
			cabecera.setIdProductor(rs.getInt(4));
		}
		return null;
	}

	public Vector getRenglonesFactura(int idFactura) {
		Connection conn = null;
		try {
            //Select * from RenglonFactura where rfaidcabecerafact = idFactura;
			conn = this.getDB2ConnectionFromProperties();
			
			String query = "Select * from RenglonFactura where rfaidcabecerafact = "+idFactura;
			Statement cs = conn.createStatement();
			ResultSet rs = cs.executeQuery(query);
			Vector vec = this.buildRenglonesFactura(rs);
			this.cerrarConexion(conn);
			return vec;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				this.cerrarConexion(conn);
			}
			return null;
	}
	
	public Vector buildRenglonesFactura(ResultSet rs) throws SQLException{
		Vector vec = new Vector();
		while(rs.next()) {
			vec.add(this.buildRenglonFactura(rs));
		}
		return vec;
	}
	
	public RenglonFactura buildRenglonFactura(ResultSet rs) throws SQLException{
		RenglonFactura renglon = new RenglonFactura();
			renglon.setIdCabeceraFactura(rs.getInt(1));
			renglon.setMonto(rs.getDouble(2));
			renglon.setFecha(rs.getDate(3));
			renglon.setIdProductor(rs.getInt(4));
		return renglon;
	}
}
