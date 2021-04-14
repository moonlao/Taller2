package model;

public class Element {
	
	public int getPosX2() {
		return posX2;
	}
	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}
	public int getPosY2() {
		return posY2;
	}
	public void setPosY2(int posY2) {
		this.posY2 = posY2;
	}
	String palabra;
	boolean interaccion;
	int tipo;
	public static final int TIPO_1 = 1;
	public static final int TIPO_2 = 2;
	public static final int TIPO_3 = 3;
	public static final int TIPO_4 = 4;
	public static final int TIPO_5 = 5;
	int posX;
	int posY;
	int posX2;
	int posY2;
	String url;
	
	public Element(String palabra, String url,boolean interaccion, int tipo, int posX, int posY, int posX2, int posY2) {
		super();
		this.palabra = palabra;
		this.url = url;
		this.interaccion = interaccion;
		this.tipo = tipo;
		this.posX = posX;
		this.posY = posY;
		this.posX2 = posX2;
		this.posY2 = posY2;
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
