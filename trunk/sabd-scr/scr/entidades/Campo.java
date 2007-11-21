package scr.entidades;

public class Campo {

	private int id;
	private int idProductor;
	private int idDomicilio;
	private String nombre;
	private int hectareas;
	
	public int getHectareas() {
		return hectareas;
	}
	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public int getIdProductor() {
		return idProductor;
	}
	public void setIdProductor(int idProductor) {
		this.idProductor = idProductor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
