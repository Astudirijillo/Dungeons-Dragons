package com.formacion.dungeonsAndDragons;

public class Human {

	public int health = 100;
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int atacar(int enemyHealth) {
		if (enemyHealth < 0) {
			return enemyHealth = 0;
		} else {
			return enemyHealth -= strength;
		}
	}

	public Human() {

	}

	@Override
	public String toString() {
		return "Personaje \n " + "Salud: " + health + "\n Fuerza: " + strength + "\n Sigilo: " + stealth
				+ "\n Inteligencia: " + intelligence;
	}

}
