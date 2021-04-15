package controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import model.*;
import processing.core.*;
import view.Interface;

public class Control extends PApplet {

	PrintWriter escribir;

	private Composition compo;
	private Interface inter;
	private int screen;

	boolean ready4;
	boolean ready7;
	boolean ready12;
	boolean ready13;
	boolean ready14;
	boolean ready17;
	boolean ready18;
	boolean ready19;
	boolean ready22;
	boolean ready23;
	boolean ready24;
	boolean ready25;
	boolean ready26;
	boolean ready27;
	boolean ready28;
	
	

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
	PImage P3;
	PImage P4;
	PImage P5;
	PImage P6;
	PImage P7;
	PImage P8;
	PImage P9;
	PImage P10;
	PImage P11;
	PImage P12;
	PImage P13;
	PImage P14;
	PImage P15;
	PImage P16;
	PImage P17;
	PImage P18;
	PImage P19;
	PImage P20;
	PImage P21;

	int parallax;
	boolean move;
	String[] cuento;

	ArrayList<Element> ele;

	public void settings() {
		size(1000, 1000);
		cuento = loadStrings("./texto/retratoOval.txt");
		ele = new ArrayList<Element>();

		Element a1 = new Element("persianas", "./data/elemento1.png", false, Element.TIPO_1, 707, 323, 969, 615);
		ele.add(a1);
		Element a2 = new Element("candelabro", "./data/elemento2.png", false, Element.TIPO_2, 203, 352, 312, 431);
		ele.add(a2);
		Element a3 = new Element("cortinas", "./data/elemento3.png", false, Element.TIPO_3, 59, 559, 315, 812);
		ele.add(a3);
		Element a4 = new Element("volumen", "./data/elemento4.png", false, Element.TIPO_4, 474, 773, 535, 816);
		ele.add(a4);
		Element a5 = new Element("cuadro", "./data/elemento5.png", false, Element.TIPO_5, 520, 173, 605, 273);
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

		P3 = null;
		P3 = loadImage("./data/P3.png");

		P4 = null;
		P4 = loadImage("./data/P4.png");

		P5 = null;
		P5 = loadImage("./data/P5.png");

		P6 = null;
		P6 = loadImage("./data/P6.png");

		P7 = null;
		P7 = loadImage("./data/P7.png");

		P8 = null;
		P8 = loadImage("./data/P8.png");

		P9 = null;
		P9 = loadImage("./data/P9.png");

		P10 = null;
		P10 = loadImage("./data/P10.png");

		P11 = null;
		P11 = loadImage("./data/P11.png");

		P12 = null;
		P12 = loadImage("./data/P12.png");

		P13 = null;
		P13 = loadImage("./data/P13.png");

		P14 = null;
		P14 = loadImage("./data/P14.png");

		P15 = null;
		P15 = loadImage("./data/P15.png");

		P16 = null;
		P16 = loadImage("./data/P16.png");

		P17 = null;
		P17 = loadImage("./data/P17.png");

		P18 = null;
		P18 = loadImage("./data/P18.png");

		P19 = null;
		P19 = loadImage("./data/P19.png");

		P20 = null;
		P20 = loadImage("./data/P20.png");

		P21 = null;
		P21 = loadImage("./data/P21.png");

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

	public void escribirResultado() {
        ArrayList<String> a = new ArrayList<String>();
		escribir = createWriter("./texto/textoNuevo.txt");
		for (int i = 0; i < ele.size(); i++) {
			a.add(ele.get(i).getPalabra());
		}
		
		for (int i =0;i<cuento.length;i++) {
			for (int j = 0; j < a.size(); j++) {
				if(a.get(j).equals(cuento[i])) {
					cuento[i] = cuento[i].toUpperCase();
				}
			}
		}
		System.out.println("cuento length "+cuento.length);
		for (int i = 0; i < cuento.length; i++) {
			escribir.println(cuento[i]);
			System.out.println("cuento flush");
		}
		
		escribir.flush();
		escribir.close();
	}

	public void draw() {
		switch (screen) {
		case 1:

			// PORTADA

			image(coverScreen, 0, 0, 1000, 1000);

			break;

		case 2:

			// PARALLAX

			image(background, -150 + (parallax), 0, 2000, 1000);
			image(midground, -150 + (parallax * 2), 0, 2000, 1000);
			image(foreground2, -150 + (parallax * 3), 0, 2000, 1000);
			image(personajes, 0, 0, 2000, 1000);
			image(foreground1, -150 + (parallax * 3), 0, 2000, 1000);
			
	

			if (mouseX > 800) {

				if (parallax >= -35) {
					// parallax = parallax - 2;
					parallax = parallax - 20;

				} else {
					move = true;
					image(flecha, 0,0,1000,1000);
				}

			}

			break;

		case 3:

			// TEXTO P1
			image(P1, 0, 0, 1000, 1000);

			break;

		case 4:

			// P2
			image(P2, 0, 0, 1000, 1000);
			ready4 = true;

			break;

		case 5:

			// ELEMENTO 1

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_1) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 6:

			// P3

			image(P3, 0, 0, 1000, 1000);

			break;

		case 7:

			// P4

			image(P4, 0, 0, 1000, 1000);
			ready7 = true;

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

			// P5

			image(P5, 0, 0, 1000, 1000);

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
			// funciona bien
			// P6

			image(P6, 0, 0, 1000, 1000);

			break;

		case 12:

			// no aparece
			// ********************************************************************************************
			// P7

			image(P7, 0, 0, 1000, 1000);
			ready12 = true;

			break;

		case 13:

			// P8

			image(P8, 0, 0, 1000, 1000);
			ready13 = true;

			break;

		case 14:

			// P9

			image(P9, 0, 0, 1000, 1000);
			ready14 = true;

			break;

		case 15:

			// ELEMENTO 4

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_4) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 16:

			// P10

			image(P10, 0, 0, 1000, 1000);

			break;

		case 17:

			// P11

			image(P11, 0, 0, 1000, 1000);
			ready17 = true;

			break;

		case 18:

			// P12

			image(P12, 0, 0, 1000, 1000);
			ready18 = true;

			break;

		case 19:

			// P13

			image(P13, 0, 0, 1000, 1000);
			ready19 = true;

			break;

		case 20:

			// ELEMENTO 5

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_5) {
					inter.drawElement(ele.get(i));

					break;
				}
			}

			break;

		case 21:

			// P14

			image(P14, 0, 0, 1000, 1000);

			break;

		case 22:

			// P15

			image(P15, 0, 0, 1000, 1000);
			ready22 = true;

			break;

		case 23:

			// P16

			image(P16, 0, 0, 1000, 1000);
			ready23 = true;

			break;

		case 24:

			// P17

			image(P17, 0, 0, 1000, 1000);
			ready24 = true;

			break;

		case 25:

			// P18

			image(P18, 0, 0, 1000, 1000);
			ready25 = true;

			break;

		case 26:

			// P19

			image(P19, 0, 0, 1000, 1000);
			ready26 = true;

			break;

		case 27:

			// P20

			image(P20, 0, 0, 1000, 1000);
			ready27 = true;

			break;

		case 28:

			// P21

			image(P21, 0, 0, 1000, 1000);
			ready28 = true;

			break;

		case 29:

			// overscreeen

			image(overScreen, 0, 0, 1000, 1000);

		}
	}

	public void mouseClicked() {

		// DE COVER A PARALLAX
		if (screen == 1 && mouseX > 420 && mouseX < 585 && mouseY > 731 && mouseY < 770) {
			screen = 2;

		}

		// temporal para pasar del parallax PARALLAX A CUENTO P1
		if (screen == 2 && move && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 3;

		}

		// CUENTO - P1 A P2 - mouses area de la flecha
		if (screen == 3 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 4;

		}

		// CUENTO - P2 a ELEMENTO1 - mouses area de la flecha
		if (ready4 && screen == 4 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 5;
		}

		// ELEMENTO 1 A P3
		if (screen == 5) {

			Element a = null;

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_1) {

					a = ele.get(i);

					break;
				}

			}

			if (mouseX >= a.getPosX() && mouseX <= a.getPosX2() && mouseY >= a.getPosY() && mouseY <= a.getPosY2()) {
				screen = 6;
			}

		}

		if (screen == 6 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 7;
		}

		if (ready7 && screen == 7 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 8;
		}

		// ELEMENTO 2
		if (screen == 8) {

			Element a = null;

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_2) {

					a = ele.get(i);

					break;
				}

			}

			if (mouseX >= a.getPosX() && mouseX <= a.getPosX2() && mouseY >= a.getPosY() && mouseY <= a.getPosY2()) {
				screen = 9;
			}

		}

		if (screen == 9 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 10;
		}

		// ELEMENTO 3
		if (screen == 10) {

			Element a = null;

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_3) {

					a = ele.get(i);

					break;
				}

			}

			if (mouseX >= a.getPosX() && mouseX <= a.getPosX2() && mouseY >= a.getPosY() && mouseY <= a.getPosY2()) {
				screen = 11;
			}

		}

		if (screen == 11 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 12;
		}

		if (ready12 && screen == 12 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 13;
		}

		if (ready13 && screen == 13 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 14;
		}

		if (ready14 && screen == 14 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 15;
		}

		// ELEMENTO 4
		if (screen == 15) {

			Element a = null;

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_4) {

					a = ele.get(i);

					break;
				}

			}

			if (mouseX >= a.getPosX() && mouseX <= a.getPosX2() && mouseY >= a.getPosY() && mouseY <= a.getPosY2()) {
				screen = 16;
			}

		}

		if (screen == 16 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 17;
		}

		if (ready17 && screen == 17 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 18;
		}

		if (ready18 && screen == 18 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 19;
		}

		if (ready19 && screen == 19 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 20;
		}

		// ELEMENTO 5
		if (screen == 20) {

			Element a = null;

			for (int i = 0; i < ele.size(); i++) {
				if (ele.get(i).getTipo() == Element.TIPO_5) {

					a = ele.get(i);

					break;
				}

			}

			if (mouseX >= a.getPosX() && mouseX <= a.getPosX2() && mouseY >= a.getPosY() && mouseY <= a.getPosY2()) {
				screen = 21;
			}

		}

		if (screen == 21 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 22;
		}

		if (ready22 && screen == 22 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 23;
		}

		if (ready23 && screen == 23 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 24;
		}

		if (ready24 && screen == 24 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 25;
		}

		if (ready25 && screen == 25 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 26;
		}

		if (ready26 && screen == 26 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 27;
		}

		if (ready27 && screen == 27 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 28;
		}

		if (ready28 && screen == 28 && mouseX > 800 && mouseX < 941 && mouseY > 61 && mouseY < 183) {
			screen = 29;
		}

		// if toco terminar que se imprima el txt con laspalabras en mayus
		if (screen == 29 && mouseX > 420 && mouseX < 585 && mouseY > 731 && mouseY < 770) {
			escribirResultado();
			screen = 1;
			
		}
	}

}
