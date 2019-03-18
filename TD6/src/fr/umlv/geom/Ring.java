package fr.umlv.geom;

public class Ring extends Circle {
	private int rayon_interne;

	public Ring(Point centre, int rayon, int rayon_interne) throws Exception {
		super(centre, rayon);
		if (rayon_interne < rayon) this.rayon_interne = rayon_interne;
		else throw new Exception("Le rayon interne doit etre inferieur au rayon");
	}
	
	// METHODE
	@Override
	public String toString() {
		return "cercle de rayon " + getRayon() + ", de centre " + getCentre() + ", de surface " + this.surface() + " et de rayon interne : " + this.rayon_interne;
	}
	

	
	
}

// 1
// On fait de l'héritage quand on veut avoir un objet plus spécifique qu'un objet existant

// 3
// Si la rayon intérieur est plus petit que le rayon, on leve une exception

