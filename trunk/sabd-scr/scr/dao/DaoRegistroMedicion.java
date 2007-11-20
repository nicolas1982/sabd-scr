package scr.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class DaoRegistroMedicion extends JdbcManager {
//	create function fun_insert_registro_medicion(idSensor integer, valor float)
//	returning integer;
//		define p_ret integer;
//		call sp_insert_registro_medicion(idSensor, valor) returning p_ret;
//		return p_ret;
//	end function;
	public Integer insertRegistroMedicion(Integer idSensor, Float valor){
		Connection conn = null;
		Integer retValue;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		CallableStatement callableStatement = conn.prepareCall("{? = call fun_insert_registro_medicion(?, ?)}");
		
	    // Register the type of the return value
		callableStatement.registerOutParameter(1, Types.INTEGER);
		
		// Set the value for the IN parameter
		callableStatement.setInt(2, idSensor);
		callableStatement.setFloat(3, valor);
        
		//Execute and retrieve the returned value
		callableStatement.execute();
		
        retValue = callableStatement.getInt(1);
		
		return retValue;
		
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
	
	
	
//	create function fun_on_insert_medicion(idMedicion integer)
//	returning smallint;
//		define p_ret smallint;
//		call sp_on_insert_medicion(idMedicion) returning p_ret;
//		return p_ret;
//	end function;
	public Short onInsertRegistroMedicion(Integer idMedicion){
		Connection conn = null;
		Short retValue;
		ResultSet rs = null;
		try {
		conn = this.getDB2ConnectionFromProperties();
		
		CallableStatement callableStatement = conn.prepareCall("{? = call fun_on_insert_medicion(?)}");
		
	    // Register the type of the return value
		callableStatement.registerOutParameter(1, Types.SMALLINT);
		
		// Set the value for the IN parameter
		callableStatement.setInt(2, idMedicion);
		        
		//Execute and retrieve the returned value
		callableStatement.execute();
		
        retValue = callableStatement.getShort(1);
		
		return retValue;
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.cerrarConexion(conn,rs);
		}
		return null;
	}
}