package fr.umlv.data;

public class LinkedLink<Type> {
	
	// ATTRIBUTS
	private Link lien;
	
	// CONSTUCTEUR
	public LinkedLink () {};
	
	// METHODES
	public void add(Type value) {
		Link link = new Link( value );
		link.setNext( lien );
		lien = link;
	}

	@Override
	public String toString() {
		return "LinkedLink [lien=" + lien + "]";
	}
	
	public Object get(int index) {
		// Inferieur a 0
		if ( index < 0 ) throw new RuntimeException( "Index négatif" );
		
		// Bonnes valeurs
		Link tmp = lien;
		while (index > 0) {
			if( tmp == null ) throw new RuntimeException( "Index trop grand (de plus de 1)" );
			tmp = tmp.getNext();
			index--;
		}
		
		// Trop grand
		if ( tmp == null ) throw new RuntimeException( "Liste dépassée de 1" );
		
		return tmp.getValeur();
	}
	
	public boolean contains(Object o) {
		Link tmp = lien;
		
		while( tmp.getNext() != null ) {
			if ( tmp.getValeur() == o ) return true;
			tmp = tmp.getNext();
		}
		
		if ( tmp.getValeur() == o && tmp != null ) return true;
		
		return false;
	}

}
