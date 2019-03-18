package fr.umlv.geom;

public class Circle {
	private Point centre;
	private int rayon;
	
	
	// CONSTRUCTEUR
	public Circle(Point centre, int rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
	}
	
	// GETTERS ET SETTERS
	public Point getCentre() {
		return new Point(centre.getX(), centre.getY());
	}
	
	public int getRayon() {
		return rayon;
	}
	
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	// METHODE
	@Override
	public String toString() {
		return "cercle de rayon " + rayon + ", de centre " + centre + " et de surface " + this.surface();
	}
	
	public void translate(int dx, int dy) {
		  centre.translate(dx, dy);
	}
	
	public float surface() {
		return (float)rayon*(float)rayon*(float)Math.PI;
	}
	
	public boolean contains(Point P) {
		return (centre.getX() - P.getX())*(centre.getX()- P.getX()) + (centre.getY()- P.getY())*(centre.getY() - P.getY()) < rayon*rayon;
	}
	
	public boolean contains(Point p, Circle... circles) {
		for(int i=0; i < circles.length; i++) {
			if (circles[i].contains(p)) return true;
		}
		return false;
	}
			

}

// 2
// On met les attributs en private

// 6 7
// Le code déplace les deux cercles de translate(1,1).
// Il faut donc renvoyer une copie du point quand on accede au centre

// 10
// avec ... on peut entre plusieurs disques en parametres, ils seront placés dans le tableau de cercles circles