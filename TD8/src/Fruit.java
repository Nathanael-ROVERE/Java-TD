
public abstract class Fruit {
	private int quantite;
	
	public abstract int getPrice();
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int q) {
		this.quantite = q;
	}

}
