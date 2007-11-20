package scr.entidades;

import java.sql.Date;

public class RenglonFactura {
	private int idCabeceraFactura; 	// cfaidcabecerafact    serial
	private double monto; 			// cfamontototal        decimal(10,2)
	private String fecha; 			// cfafecha             date
	private int idProductor; 		//	cfaidproductor       integer
	public String getFecha() {
		return fecha;
	}
	public void setFecha(Date date) {
		this.fecha = date.toString();
	}
	public int getIdCabeceraFactura() {
		return idCabeceraFactura;
	}
	public void setIdCabeceraFactura(int idCabeceraFactura) {
		this.idCabeceraFactura = idCabeceraFactura;
	}
	public int getIdProductor() {
		return idProductor;
	}
	public void setIdProductor(int idProductor) {
		this.idProductor = idProductor;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
}
