package scr.entidades;

public class CondicionNumerica {
	
	private int id;
	private float valorCondicion;
	private int tipoCondicionNum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipoCondicionNum() {
		return tipoCondicionNum;
	}
	public void setTipoCondicionNum(int tipoCondicionNum) {
		this.tipoCondicionNum = tipoCondicionNum;
	}
	public float getValorCondicion() {
		return valorCondicion;
	}
	public void setValorCondicion(float valorCondicion) {
		this.valorCondicion = valorCondicion;
	}
}
