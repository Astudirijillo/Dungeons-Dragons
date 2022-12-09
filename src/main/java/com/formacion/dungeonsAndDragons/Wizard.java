package com.formacion.dungeonsAndDragons;

public class Wizard extends Human {

	public Wizard() {
		super();
		this.setHealth(50);
		this.setIntelligence(8);
	}

	public Human heal(Human p1) {
		if(p1.health < 100 || p1.health > 92) {
			p1.setHealth(p1.getHealth() + this.intelligence);
		} else {
			p1.setHealth(100);
		}
		return p1;
	}

	public Human fireball(Human p1) {
		p1.setHealth(p1.getHealth() - (this.intelligence * 3));
		if(p1.getHealth() <= 0) {
			p1.setHealth(health);
		}
		return p1;
	}

	@Override
	public String toString() {
		return "Wizard \n Salud: " + health + "\n Fuerza:" + strength + "\n Sigilo: " + stealth + "\n Inteligencia: "
				+ intelligence;
	}

	/*
	 * public int howMany() {
	 * 
	 * }
	 */
}
