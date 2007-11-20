package scr.entidades;

public class Productor {
	private int idProductor;
	private int idDomicilio;
	private String nombreProductor;
	
	public void setIdProductor(int id) {
		this.idProductor = id;
		
	}

	public void setIdDomicilio(int id) {
		this.idDomicilio = id;
		
	}

	public void setNombre(String nombre) {
		this.nombreProductor = nombre;
		
	}
	
	public String getString(){
		return this.nombreProductor;
	}

	public String getNombreProductor() {
		return nombreProductor;
	}

	public void setNombreProductor(String nombreProductor) {
		this.nombreProductor = nombreProductor;
	}

	public int getIdProductor() {
		return idProductor;
	}

	public int getIdDomicilio() {
		return idDomicilio;
	}
    public String toString(){
    	return nombreProductor;
    }
}
