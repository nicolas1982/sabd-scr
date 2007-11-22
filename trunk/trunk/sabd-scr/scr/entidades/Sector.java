package scr.entidades;

import java.sql.Date;

public class Sector {
	private Integer idsector;
	private Integer idTipoCultivo;
	private Integer idcontrato;
	private Integer idcampo;
	private String  descripcion;
	
	//ver tipos datos
	private Integer srhectareas;
	private String fechahorainicio;
	private String fechahorafin;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFechahorafin() {
		return fechahorafin;
	}
	public void setFechahorafin(java.util.Date fecha) {
		String dameputafecha = fecha.toString();
		String anio = dameputafecha.substring(0,4);
		String dia = dameputafecha.substring(5,7);
		String mes = dameputafecha.substring(8,10);
		this.fechahorafin  = dia + "/" + mes + "/" + anio;
	}
	public String getFechahorainicio() {
		return fechahorainicio;
	}
	public void setFechahorainicio(java.util.Date fecha) {
		String dameputafecha = fecha.toString();
		String anio = dameputafecha.substring(0,4);
		String dia = dameputafecha.substring(5,7);
		String mes = dameputafecha.substring(8,10);
		this.fechahorainicio  = dia + "/" + mes + "/" + anio;
	}
	public Integer getIdcampo() {
		return idcampo;
	}
	public void setIdcampo(Integer idcampo) {
		this.idcampo = idcampo;
	}
	public Integer getIdcontrato() {
		return idcontrato;
	}
	public void setIdcontrato(Integer idcontrato) {
		this.idcontrato = idcontrato;
	}
	public Integer getIdsector() {
		return idsector;
	}
	public void setIdsector(Integer idsector) {
		this.idsector = idsector;
	}
	public Integer getIdTipoCultivo() {
		return idTipoCultivo;
	}
	public void setIdTipoCultivo(Integer idTipoCultivo) {
		this.idTipoCultivo = idTipoCultivo;
	}
	public Integer getSrhectareas() {
		if (this.srhectareas == null)return new Integer(0);
		return srhectareas;
	}
	public void setSrhectareas(Integer srhectareas) {
		this.srhectareas = srhectareas;
	}
	public String toString(){
		return this.descripcion;
	}
	
}
