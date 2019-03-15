package fr.umlv.fight;

public class Arena {
	
	public static Robot fight(Robot robot1, Robot robot2) {
		while (!robot1.isDead() && !robot2.isDead()) {
			robot1.fire(robot2);
			if (robot2.isDead() == false) {robot2.fire(robot1);}
			else {return robot1;}
		}
		return robot2;
	}

	public static void main(String[] args) {
		var R2D2 = new Robot("R2D2");
		R2D2.setLife(3);
		var DATA = new Robot("DATA");
		System.out.println("Le gagnant du combat est : " + Arena.fight(R2D2, DATA));
		}
}
