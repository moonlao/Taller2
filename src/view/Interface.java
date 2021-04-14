package view;

import model.Element;
import processing.core.PApplet;
import processing.core.PImage;

public class Interface {

	private PApplet app;

	public Interface(PApplet app) {
		super();
		this.app = app;
	}
	
	public void drawElement(Element element) {
		app.background(0);
		PImage elementos = null;
		elementos = app.loadImage(element.getUrl());
		app.image(elementos, 0, 0);
	}
	
}
