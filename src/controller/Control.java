package controller;

import java.util.ArrayList;

import model.*;
import processing.core.*;
import view.Interface;

public class Control extends PApplet {

	private Composition compo;
	private Interface inter;
	private int screen;

	public static void main(String[] args) {
		PApplet.main(Control.class.getName());
	}

	
	
	PImage coverScreen;
	PImage textoScreen;
	PImage textoScreen2;
	PImage overScreen;
	PImage elemento0;

	ArrayList<Element> ele;
	
	public void settings() {
		size(1000,1000);
		
		

		ele = new ArrayList<Element>();

		Element a1 = new Element("Cortina", "./data/elemento1.png", false, Element.TIPO_1, 0, 0, 0, 0);
		ele.add(a1);
		Element a2 = new Element("Lampara", "./data/elemento2.png", false, Element.TIPO_2, 0, 0, 0, 0);
		ele.add(a2);
		Element a3 = new Element("Cama", "./data/elemento3.png", false, Element.TIPO_3, 0, 0, 0, 0);
		ele.add(a3);
		Element a4 = new Element("Libro", "./data/elemento4.png", false, Element.TIPO_4, 0, 0, 0, 0);
		ele.add(a4);
		Element a5 = new Element("Pintura", "./data/elemento5.png", false, Element.TIPO_5, 0, 0, 0, 0);
		ele.add(a5);
		
		
		// posX y posY area sensible elementos

		compo = new Composition(ele);
		
		inter = new Interface(this);

	}

	public void setup() {
		
		screen = 1;
	
		coverScreen = null;
		coverScreen = loadImage("./data/coverScreen.png");
		
		textoScreen = null;
		textoScreen = loadImage("./data/textoScreen.png");
		
		textoScreen2 = null;
		textoScreen2 = loadImage("./data/textoScreen2.png");
		
		overScreen = null;
		overScreen = loadImage("./data/overScreen.png");
		
		elemento0 = null;
		elemento0 = loadImage("./data/elemento0.png");
	}
	
	

	public void draw() {
		switch (screen) {
		case 1:
			
			image(coverScreen, 0, 0, 1000,1000);

			break;

		case 2:
			
			


			break;

		case 3:
			image(textoScreen, 0, 0, 1000,1000);


			break;

		case 4:
			image(textoScreen2, 0, 0, 1000,1000);



			break;

		case 5:
			
			image(elemento0, 0, 0, 1000,1000);

			break;

		case 6:
			
			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_1) {
					inter.drawElement(ele.get(i));
					
					break;
				}
			}
			
			

			break;
			
		case 7:
			
			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_2) {
					inter.drawElement(ele.get(i));
					
					break;
				}
			}

			break;
			
		case 8:
			
			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_3) {
					inter.drawElement(ele.get(i));
					
					break;
				}
			}

			break;
			
		case 9:
			
			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_4) {
					inter.drawElement(ele.get(i));
					
					break;
				}
			}

			break;
			
		case 10:
			
			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_5) {
					inter.drawElement(ele.get(i));
					
					break;
				}
			}

			break;
			
		case 11:
			
			image(overScreen, 0, 0, 1000,1000);

			break;

		}
	}

	public void mouseClicked() {

	}

}
