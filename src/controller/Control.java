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
	PImage P2;
	PImage P1;
	PImage overScreen;
	PImage elemento0;
	PImage foreground1;
	PImage foreground2;
	PImage personajes;
	PImage midground;
	PImage background;
	PImage flecha;

	int parallax;
	boolean move;

	ArrayList<Element> ele;

	public void settings() {
		size(1000, 1000);

		ele = new ArrayList<Element>();

		Element a1 = new Element("Cortina", "./data/elemento1.png", false, Element.TIPO_1, 0, 0, 1000, 1000);
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

		P2 = null;
		P2 = loadImage("./data/P2.png");

		P1 = null;
		P1 = loadImage("./data/P1.png");

		overScreen = null;
		overScreen = loadImage("./data/overScreen.png");

		elemento0 = null;
		elemento0 = loadImage("./data/elemento0.png");

		foreground1 = null;
		foreground1 = loadImage("./data/foreground1.png");

		foreground2 = null;
		foreground2 = loadImage("./data/foreground2.png");

		personajes = null;
		personajes = loadImage("./data/personajes.png");

		midground = null;
		midground = loadImage("./data/midground.png");

		background = null;
		background = loadImage("./data/background.png");

		parallax = 35;

		flecha = null;
		flecha = loadImage("./data/flecha.png");

		move = false;
	}

	public void draw() {
		switch (screen) {
		case 1:

			// PORTADA

			image(coverScreen, 0, 0, 1000, 1000);

			textSize(15);
			fill(255);
			text(mouseX + "," + mouseY, mouseX, mouseY);

			break;

		case 2:

			// PARALLAX

			// image(flecha, 0, 0, 1000, 1000);
			image(background, -150 + (parallax), 0, 2000, 1000);
			image(midground, -150 + (parallax * 2), 0, 2000, 1000);
			image(foreground2, -150 + (parallax * 3), 0, 2000, 1000);
			image(personajes, 0, 0, 2000, 1000);
			image(foreground1, -150 + (parallax * 3), 0, 2000, 1000);

			if (mouseX > 800) {

                if (parallax >= -35) {
                    parallax= parallax -2;

                }else {
                	move = true;
                }


            }

			textSize(15);
			fill(255);
			text(mouseX + "," + mouseY, mouseX, mouseY);

			break;

		case 3:

			// TEXTO P1
			image(P1, 0, 0, 1000, 1000);

			textSize(15);
			fill(255);
			text(mouseX + "," + mouseY, mouseX, mouseY);

			break;

		case 4:

			// P2
			image(P2, 0, 0, 1000, 1000);

			textSize(15);
			fill(255);
			text(mouseX + "," + mouseY, mouseX, mouseY);

			break;

		case 5:

			// ELEMENTO 0

			//image(elemento0, 0, 0, 1000, 1000);

			
			
			// ELEMENTO 1

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_1) {
					inter.drawElement(ele.get(i));

					break;
				}
			}
			
			
			textSize(15);
			fill(255);
			text(mouseX + "," + mouseY, mouseX, mouseY);

			break;

		case 6:

			break;

		case 7:

			// P3

			image(elemento0, 0, 0, 1000, 1000);

			break;

		case 8:

			// ELEMENTO 2

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_2) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 9:

			// ELEMENTO2_2

			image(elemento0, 0, 0, 1000, 1000);

			break;

		case 10:

			// ELEMENTO 3

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_3) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 11:

			// ELEMENTO 4

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_4) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 12:

			// ELEMENTO 5

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_5) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 13:

			// FINAL SCREEN

			image(overScreen, 0, 0, 1000, 1000);

			break;

		}
	}

	public void mousePressed() {

		// DE COVER A PARALLAX
		if (screen == 1 && mouseX > 420 && mouseX < 585 && mouseY > 731 && mouseY < 770) {
			screen = 2;

		}

		// temporal para pasar del parallax PARALLAX A CUENTO P1
		if (screen == 2 && mouseX > 800 && move) {
			screen = 3;

		}


		// CUENTO - P1 A P2 - mouses area de la flecha
		if (screen == 3 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 4;
		}

		// CUENTO - P2 a ELEMENTO1 - mouses area de la flecha
		if (screen == 4 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 5;
		}
	}

}
