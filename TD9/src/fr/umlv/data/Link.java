package fr.umlv.data;

class Link {
	
	// ATTRIBUTS
	private Object val;
	private Link next;
	
	// CONSTRUCTEUR
	Link (Object objet) {
		this.val = objet;
		next = null;
	}
	
	// GETTERS & SETTERS
	Object getValeur() {
		return val;
	}
	
	void setValeur(Object objet) {
		this.val = objet;
	}
	
	Link getNext() {
		return next;
	}
	
	void setNext(Link suiv) {
		this.next = suiv;
	}
	
	// METHODES
	@Override
	public String toString() {
		return "Link [val=" + val + ", next=" + next + "]";
	}

	public static void main(String[] args) {
		
	}
}

