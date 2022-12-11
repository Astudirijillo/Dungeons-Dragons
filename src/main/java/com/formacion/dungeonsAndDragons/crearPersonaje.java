package com.formacion.dungeonsAndDragons;

import com.formacion.dungeonsAndDragons.*;

public class crearPersonaje {

	public static void main(String[] args) {

		Human humanTest = new Human();

		Wizard w1 = new Wizard();
		Ninja n1 = new Ninja();
		Samurai s1 = new Samurai();

		// w1.fireball(humanTest);
		// w1.heal(humanTest);

		// n1.steal(humanTest);
		// n1.runaway();

		// s1.deathBlow(humanTest);
		// s1.meditate();

		Samurai s2 = new Samurai();
		Samurai s3 = new Samurai();
		Samurai s5 = new Samurai();

		System.out.println("Samurais creados: " + Samurai.howMany());

		/*
		 * System.out.println(humanTest.toString()); System.out.println(" ");
		 * System.out.println(w1.toString()); System.out.println(" ");
		 * System.out.println(n1.toString()); System.out.println(" ");
		 * System.out.println(s1.toString());
		 */

	}

}
