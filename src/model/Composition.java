package model;

import java.util.ArrayList;

public class Composition {

	ArrayList<Element> elementos;
	ArrayList<String> cuentoResultado;
	
	public Composition(ArrayList<Element> elementos) {
		super();
		this.elementos = elementos;
		cuentoResultado = new ArrayList<String>();
	}
	
	public ArrayList<Element> getElementos() {
		return elementos;
	}
	public void setElementos(ArrayList<Element> elementos) {
		this.elementos = elementos;
	}
	public ArrayList<String> getCuentoResultado() {
		return cuentoResultado;
	}
	public void setCuentoResultado(ArrayList<String> cuentoResultado) {
		this.cuentoResultado = cuentoResultado;
	}
	
	public boolean finalizar() {
		boolean fin = false;
		for (int i = 0; i < elementos.size(); i++) {
			if(elementos.get(i).isInteraccion()) {
				 cuentoResultado.add(elementos.get(i).getPalabra()); 
				 fin = true;
			}else {
				fin = false;
			}
		}
		return fin;
	}
	
	
}
