package model;

public class Element {
	
	String palabra;
	boolean interaccion;
	int tipo;
	static final int TIPO_1 = 1;
	static final int TIPO_2 = 2;
	static final int TIPO_3 = 3;
	static final int TIPO_4 = 4;
	static final int TIPO_5 = 5;
	int posX;
	int posY;
	String url;
	
	public Element(String palabra, String url,boolean interaccion, int tipo, int posX, int posY) {
		super();
		this.palabra = palabra;
		this.url = url;
		this.interaccion = interaccion;
		this.tipo = tipo;
		this.posX = posX;
		this.posY = posY;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isInteraccion() {
		return interaccion;
	}
	public void setInteraccion(boolean interaccion) {
		this.interaccion = interaccion;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
	
}
