package td4;

import java.util.ArrayList;
import java.util.Iterator;

public class FreeShoppingCart {
	
	// PARAMETRES
	private ArrayList<Book> livres;

	// 1
	// On spécifie <Book> pour lever le warning

	
	// GETTER
	public ArrayList<Book> getLivres() {
		return livres;
	}

	// SETTER
	public void setLivres(ArrayList<Book> livres) {
		this.livres = livres;
	}

	// CONSTRUCTEUR
	public FreeShoppingCart() {
		this.livres = new ArrayList<Book>(); 
	}
	
	// METHODES
	public void add(Book book) {
		this.livres.add(book);
	}
	
	@Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
		sb.append("Nombre de livres : " + livres.size());
		for (int i = 0; i < livres.size(); i++) {
			sb.append("\n - " + livres.get(i).toString());
		}
		return new String(sb);
	}
	
    public void printContent() {
    	System.out.println(toString());
    }
	
	// 2
	// On procède comme dans la classe ArrayShoppingCart
//	public Book longestTitle() {
//		int tmp = -1;
//		for (int i = 0; i < livres.size(); i++) {
//			if (tmp == -1 || livres.get(tmp).getTitle().length() <= livres.get(i).getTitle().length()) {
//				tmp = i;
//			}
//		}
//		
//		if (tmp == -1) {
//			return null;
//		}
//		
//		return livres.get(tmp);
//	}
	
	// 3
//	public Book longestTitle() {
//  		Book longuest = null;
//  		Iterator<Book> itr = livres.iterator();
//  		
//  		while (itr.hasNext()) {
//  			Book tmp = itr.next();
//  			if (longuest == null || longuest.getTitle().length() <= tmp.getTitle().length()) {
//  				longuest = tmp;
//  			}
//  		}
//  		
//  		return longuest;
//  	}
	
	// 4
	public Book longestTitle() {
  	    Book longest = null;
	    for (Book book : livres) {
	    	if (longest == null || longest.getTitle().length() <= book.getTitle().length()) {
	    		longest = book;
	    	}
	    }
	    return longest;
	}
	// foreach est plus optimisé sur les collections !
	
	// 5, 6
	public void removeFirstOccurence(Book book) {
		livres.remove(book);
	}
	// Complexite la pire : n
	
	// 7
	// On utilise un itérateur quand on ne sait pas où est l'élément dans une collection
	
	

}
