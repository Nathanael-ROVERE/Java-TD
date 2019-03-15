package fr.umlv.fight;

public class Robot {
	
	
	// PARAMETRES
	private String name;
	private int life;
	
	protected static int HEALTH_DEFAULT = 10;
	protected static int FIRE = 2;
	
	//GETTERS
	public int getLife() {
		return life;
	}
	
	public String getName() {
		return name;
	}
	
	
	// SETTERS
	public void setLife(int life) {
		this.life = life;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	// CONSTRUCTEUR
	public Robot(String name) {
		this.life = HEALTH_DEFAULT;
		this.name = name;
	}

	
	// METHODES
	
	protected boolean rollDice() {
		return true;
	}
	
	public void fire(Robot targetRobot) {
		if (targetRobot.isDead()) {
			throw new IllegalArgumentException(this + " a voulu tirer sur un mort");
		}
		targetRobot.life -= FIRE;
		System.out.println(targetRobot + " a été touché par " + name);
		System.out.println(targetRobot + " a " + targetRobot.getLife() + " points de vie");
	}
	
	public boolean isDead() {
		if (life <= 0) {
			System.out.println(this +" est mort");
			return true;}
		else {
			return false;}
	}
	
	@Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
		sb.append("Robot " + name);
		return new String(sb);
	}
	
	
	// MAIN
	public static void main(String[] args) {
		var bob = new Robot("bob");
		System.out.println(bob);
		
		var target = new Robot("target");
		target.setLife(2);
		bob.fire(target);
		bob.isDead();
		target.isDead();

	}

}
