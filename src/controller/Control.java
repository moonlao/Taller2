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

	public void settings() {

		ArrayList<Element> ele = new ArrayList<Element>();

//	 Element a1 = new Element("Cortina", url, false, Element.TIPO_1, posX, posY);
//   ele.add(a1);
//	 Element a2 = new Element("Libro", url, false, Element.TIPO_2, posX, posY);
//   ele.add(a2);
//	 Element a3 = new Element("Lampara", url, false, Element.TIPO_3, posX, posY);
//   ele.add(a3);
//	 Element a4 = new Element("", url, false, Element.TIPO_4, posX, posY);
//     ele.add(a4);
//	 Element a5 = new Element("", url, false, Element.TIPO_5, posX, posY);
//   ele.add(a5);

		compo = new Composition(ele);

	}

	public void setup() {

	}

	public void draw() {
		switch (screen) {
		case 1:

			break;

		case 2:

			break;

		case 3:

			break;

		case 4:

			break;

		case 5:

			break;

		case 6:

			break;

		}
	}

	public void mouseClicked() {

	}

}
