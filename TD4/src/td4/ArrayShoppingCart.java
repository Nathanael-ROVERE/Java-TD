package td4;

public class ArrayShoppingCart {

	// PARAMETRES
	private Book[] array;
	private int quantite;	
	private int max;
	
	
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
		this.max = max;
	}

	// METHODES
	public void add(Book book) throws Exception {
		if ( quantite >= max ) {
			throw new Exception ("Le nombre maximum de livres est atteint");
		}
		this.array[quantite] = book;
		quantite++;
	}
	
	@Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
			sb.append("Quantite : " + quantite + " / " + max + " livres");
		for (int i = 0; i < quantite; i++) {
			sb.append("\n - " + array[i].toString());
		}
		return new String(sb);
	}
    
    public void printContent() {
    	System.out.println(toString());
    }
    
    public Book longestTitle() {
    	int tmp = -1;
    	for (int i = 0; i < quantite; i++) {    		
    		if (tmp == -1 || array[tmp].getTitle().length() <= array[i].getTitle().length()) {
    			tmp = i;
    		}
    	}
    	
    	if (tmp == -1) {
    		return null;
    	}
    	
    	return array[tmp];
    	
    }
}
