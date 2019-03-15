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
	public void fire(Robot targetRobot) {
		if (targetRobot.isDead()) {
			throw new IllegalArgumentException(this + " a voulu tirer sur un mort");
		}
		targetRobot.life -= FIRE;
		System.out.println("Robot " + targetRobot.getName() + " a été touché par " + name);
	}
	
	public boolean isDead() {
		if (life <= 0) {
			System.out.println("Le robot " + name +" est mort");
			return true;}
		else {
			System.out.println("Le robot " + name + " est vivant, il a " + life + " points de vie");
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
		System.out.println("Vie avant tir " + target.getLife());
		bob.fire(target);
		System.out.println("Vie après tir " + target.getLife());
		bob.isDead();
		target.isDead();

	}

}
