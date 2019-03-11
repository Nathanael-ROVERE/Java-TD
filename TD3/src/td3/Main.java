package td3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// EXERCICE 1
		// 2
//		var book = new Book();
//		System.out.println(book.title + ' ' + book.author);
		
		// 7
//		Book livre = new Book ("1984", "George Orwell");
//		System.out.println(livre.getTitle() + ' ' + livre.getAuthor());
		
		// 9
//		Book livre2 = new Book ("Le seigneur des anneaux");
//		System.out.println(livre2.getTitle() + ' ' + livre2.getAuthor());

		// EXERCICE 2
		// 1
		var b1 = new Book("Da Java Code", "Duke Brown");
	    var b2 = b1;
	    var b3 = new Book("Da Java Code", "Duke Brown");

	    System.out.println(b1 == b2); // true
	    System.out.println(b1 == b3); // false
	    
	    //2
	    System.out.println(b1.equals(b3)); // true
	    
	    // 4
//	    var list = new ArrayList();
//	    list.add(b1);
//	    System.out.println(list.indexOf(b2)); // 0
//	    System.out.println(list.indexOf(b3)); // -1, puis 0
	    // Problème : b3 est aussi contenu dans b1, mais indefOf(b3) renvoie -1. Problème du à des références différentes.
	    
	    // 5
	    // La méthode indexOf appelle equals
	    
	    // 8 
	    // Override sert à dire au compilateur qu'on redéfinit une méthode déjà existante
	    
	    // 9
		var aBook = new Book("oui", "Oui");
		var anotherBook = new Book("oui", "Oui");
		var listL = new ArrayList();
		listL.add(aBook);
		System.out.println(listL.indexOf(anotherBook));
		
		// renvoie NullPointerException car on initialise des book(null, null)
		// Le code arrête de fonctionner pour nous avertir d'une grosse erreur
		
		// 10 
		// Pour un null on utilise assert
		
		// EXERCICE 3
		
		//1
		var livre_ex3 = new Book("Petit Pays", "Gael Faye");
		System.out.println(livre_ex3.toString());
		
		// 2
		// Oui, on peut utiliser override car toString() existe déjà
		
		// 3
	    
	}

}

