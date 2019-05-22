package fr.umlv.game;

public class Shield implements HandItem {
    private int defense;
    
    public Shield(int defense) {
        this.defense = defense;
    }
    
    public int getDefense() {
        return this.defense;
    }

	@Override
	public int getDamage() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shield [defense=" + defense + "]";
	}
	
	
}
