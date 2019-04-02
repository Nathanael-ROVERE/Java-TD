
import java.util.ArrayList;

public class Basket {
	// PARAMETRES
	private ArrayList<Fruit> panier;	

	// CONSTRUCTEUR
	public Basket() {
		this.panier = new ArrayList<Fruit>();
	}
	
	// METHODES
	public void add(Fruit a) {
		this.panier.add(a);
	}
	
	public void add(Fruit a, int n) {
		if (n>1) {
			
		}
		a.setQuantite(n);
		this.panier.add(a);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		int total = 0;
		for (Fruit a : panier) {
			str.append(a.toString() + " x " + a.getQuantite() + "\n");
			total = total + a.getPrice() * a.getQuantite();
		}
		str.append("price: " + total);
		return str.toString();
	}
	
	
	

}
