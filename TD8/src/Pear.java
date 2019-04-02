
public class Pear extends Fruit{
	private int valeurJus;

	public Pear(int valeurJus) {
		super();
		this.valeurJus = valeurJus;
	}
	
	@Override
	public String toString() {
		return ("Poire de valeur : " + this.valeurJus);
	}
	
	public int getPrice() {
		return valeurJus * 3;
	}
	
}
