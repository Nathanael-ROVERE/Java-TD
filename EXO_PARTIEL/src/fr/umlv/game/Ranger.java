package fr.umlv.game;

public class Ranger extends Fighter {
	private Weapon arme;
	private int spell;
	
	public Ranger(String name, Weapon arme, int health) {
		super(name, health);
		this.arme = new Weapon(arme.getName(), arme.getDamage());
		this.spell = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ranger ").append(this.getName()).append(" *");
		sb.append(this.getHealth()).append("*, ").append(arme).append(", spell = ").append(spell);
		return sb.toString();
	}
	
	public void learnNewSpell(int spell) {
		if (this.spell < spell) {
			this.spell = spell;
		}
	}
	
    public int attack() {
        return arme.getDamage() + spell;
    }
    
    public int defense() {
        return this.getHealth();
    }
	

}
