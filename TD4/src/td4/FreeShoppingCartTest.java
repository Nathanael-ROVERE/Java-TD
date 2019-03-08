package td4;

public class FreeShoppingCartTest {
	
	public static void main(String[] args) {
		
		FreeShoppingCart tab = new FreeShoppingCart();
		Book a = new Book("La Nuit des Temps", "René Barjavel");
		tab.add(a);
		tab.add(new Book("One Piece", "Eiichiro Oda"));
		tab.add(new Book("Quartier Lointain", "Jiro Taniguchi"));
		
		tab.printContent();
		
		System.out.println("\n Titre le plus long : " + tab.longestTitle().getTitle());
		
		tab.removeFirstOccurence(a);
		
		tab.printContent();
	}
}
