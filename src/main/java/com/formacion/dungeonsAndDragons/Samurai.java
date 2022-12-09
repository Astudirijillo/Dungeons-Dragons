package com.formacion.dungeonsAndDragons;

public class Samurai extends Human {

	private static int samuraisCreados;

	public Samurai() {
		super();
		this.health = 200;
		samuraisCreados++;
	}

	public Human deathBlow(Human p1) {
		p1.setHealth(0);
		this.health /= 2;
		return p1;
	}

	public void meditate() {
		this.health += (this.health / 2);
	}

	@Override
	public String toString() {
		return "Samurai \n Salud: " + health + "\n Fuerza:" + strength + "\n Sigilo: " + stealth + "\n Inteligencia: "
				+ intelligence;
	}

	public static int howMany() {
		return samuraisCreados;
	}
}
