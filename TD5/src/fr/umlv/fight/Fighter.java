package fr.umlv.fight;

import java.util.Random;

public class Fighter extends Robot {
	
	// PARAMETRES
	private int seed;
	Random nbRandom;
	
	public Fighter(String name, int seed) {
		super(name);
		this.seed = seed;
		nbRandom = new Random(this.seed);
	}
	
	@Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
		sb.append("Fighter " + getName());
		return new String(sb);
	}
	
	// MAIN
	public static void main(String[] args) {
		var john = new Fighter("John", 1);
	    var jane = new Fighter("Jane", 2);
	    System.out.println(Arena.fight(john, jane) + " wins");

	}


}

// 1
// un générateur pseudo aléatoire renvoie un entier selon une certaine loi, 
// qui est donc toujours reproductible
// Avec un meme seed, on a toujours le meme résultat

// 3
// on controle mieux avec des getters et des setters