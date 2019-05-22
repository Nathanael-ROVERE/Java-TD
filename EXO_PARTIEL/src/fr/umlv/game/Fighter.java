package fr.umlv.game;

public abstract class Fighter {
    private String name;
    private int health;
    
    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    
    public int getHealth() {
        return this.health;
    }
	
    // CONSTRUCTEUR 
    public Fighter(String name, int health) {
		this.name = name;
		this.health = health;
	}
    
    public int attack() {
    	return 0;
    }
    
    public int defense() {
    	return 0;
    }
    
	public void fight(Fighter challenger) {    	
        int thisAtk = attack();
        int thisHealth = health;
        int challengerAtk = challenger.attack();
        int challengerHealth = challenger.getHealth();
        
        while (thisHealth > 0 && challengerHealth > 0) {
            thisHealth -= challengerAtk;
            challengerHealth -= thisAtk;
        }
        
        if (thisHealth <=0 && challengerHealth <=0) {
            System.out.println("nobody won the fight!");
        }
        else if (thisHealth <=0) {
            System.out.println(challenger.getName() + " won the fight!");
        }
        else {
            System.out.println(this.getName() + " won the fight!");
        }
    }
}
