package scr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import scr.entidades.Sensor;

public class SensoresDao extends JdbcManager{

	public Vector<Sensor> getSensores(Integer idSector){
		Connection conn = null;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		String query = "SELECT seridsensor, seridsector, sertiposensor FROM sensor WHERE seridsector = "+  idSector;
        
		Statement statement = conn.createStatement();
		rs = statement.executeQuery(query);		
		
		return this.buildSensoresFromResultSet(rs);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.cerrarConexion(conn,rs);
		}
		return null;
	}
	
	private Vector<Sensor> buildSensoresFromResultSet(ResultSet rs) throws SQLException{
		Vector<Sensor> vec =  new Vector<Sensor>();
		Sensor sensor;
		
		while(rs.next()) {
			sensor = new Sensor();
			sensor.setIdSensor(rs.getInt(1));
			sensor.setIdSector(rs.getInt(2));
			sensor.setTiposensor(rs.getShort(3));
			vec.add(sensor);
		}
		return vec;
	}
}
