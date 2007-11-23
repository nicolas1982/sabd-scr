package scr.entidades;

public class CondicionNumerica extends Condicion {
	private float valorCondicion;
	private int tipoCondicionNum;
	
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
