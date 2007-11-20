package scr.entidades;

import java.sql.Timestamp;

public class Sector {
	private Integer idsector;
	private Integer idTipoCultivo;
	private Integer idcontrato;
	private Integer idcampo;
	private String  descripcion;
	
	//ver tipos datos
	private Integer srhectareas;
	private Timestamp fechahorainicio;
	private Timestamp fechahorafin;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Timestamp getFechahorafin() {
		return fechahorafin;
	}
	public void setFechahorafin(Timestamp fechahorafin) {
		this.fechahorafin = fechahorafin;
	}
	public Timestamp getFechahorainicio() {
		return fechahorainicio;
	}
	public void setFechahorainicio(Timestamp fechahorainicio) {
		this.fechahorainicio = fechahorainicio;
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
		return srhectareas;
	}
	public void setSrhectareas(Integer srhectareas) {
		this.srhectareas = srhectareas;
	}
	
}
