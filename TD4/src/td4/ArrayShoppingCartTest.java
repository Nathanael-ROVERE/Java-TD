package td4;

public class ArrayShoppingCartTest {
	
		
	// MAIN
	public static void main(String[] args) {
		
		ArrayShoppingCart tab = new ArrayShoppingCart(4);
		
		try {
		
			tab.add(new Book("La Nuit des Temps", "René Barjavel"));
			tab.add(new Book("One Piece", "Eiichiro Oda"));
			tab.add(new Book("Quartier Lointain", "Jiro Taniguchi"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		tab.printContent();
		
		System.out.println("Le titre le plus long est : " + tab.longestTitle().getTitle());
		

	}	
}

//1
// Il n'est pas intéressant de stocker le nombre max de livres 
//dans une variable statique car la valeur depend de chaque instance
		
// 2
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
// On doit gérer une exception dans le add()

