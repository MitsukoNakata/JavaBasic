package practice13.common;

public class SuperHero	extends Hero {
	public Item equiment;

	public int attack() {
		return super.attack() + equiment.getAdditionalDamage();

	}

	public Item getEquiment() {
		return equiment;
	}

	public void setEquiment(Item equiment) {
		this.equiment = equiment;
	}




}
