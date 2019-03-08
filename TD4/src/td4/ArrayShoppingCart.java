import TD3.Book;

public class ArrayShoppingCart {

	// PARAMETRES
	private Book[] array;
	private int quantite;	
	final private int max;
	
	//1
	// Il n'est pas intéressant de stocker le nombre max de livres dans une variable statique car la valeur depend de chaque instance
		
	// GETTER
	public Book[] getArray() {
		return array;
	}
		
	// SETTER
	public void setArray(Book[] array) {
		this.array = array;
	}
		
	// CONSTRUCTEUR
	public ArrayShoppingCart(int max) {
		super();
		this.array = new Book[max];
		this.quantite = 0;
		this.max = max;
	}

	// METHODES
	public void add(Book book) {
		this.array[quantite++] = book;
	}
}
