package fr.umlv.geom.main;

import fr.umlv.geom.Circle;
import fr.umlv.geom.Point;
import fr.umlv.geom.Ring;

public class Main {

	public static void main(String[] args) {
		//	    var point = new Point(1, 2);
		//	    var circle = new Circle(point, 1);
		//	    var circle2 = new Circle(point, 2);
		//	    circle2.translate(1, 1);
		//	    System.out.println(circle + " | " + circle2);
		//	    
		//	    var p = new Point(1, 2);
		//	    var c = new Circle(p, 3);
		//	    c.getCentre().translate(1,1);
		//	    System.out.println(p);
		////	    System.out.println(c.surface());
		//	    System.out.println(c.contains(new Point(45,50)));

		var point = new Point(1, 2);
		var circle = new Circle(point, 2);
		System.out.println(circle);
		try {
			var ring = new Ring(point, 2, 1);
			System.out.println(ring);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		};



		
	}
}
