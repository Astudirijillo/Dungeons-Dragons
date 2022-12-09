package com.formacion.dungeonsAndDragons;

public class Ninja extends Human {

	public Ninja() {
		super();
		this.stealth = 10;
	}

	public Human steal(Human p1) {
		p1.setHealth(p1.getHealth() - this.stealth);
		if (this.health < 100 || this.health > 91) {
			this.health = 100;
		} else {
			this.health += this.stealth;
		}
		return p1;
	}

	public void runaway() {
		this.setHealth(this.getHealth() - this.stealth);
	}

	@Override
	public String toString() {
		return "Ninja \n Salud: " + health + "\n Fuerza:" + strength + "\n Sigilo: " + stealth + "\n Inteligencia: "
				+ intelligence;
	}
}
