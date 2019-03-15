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
	
	@Override
	protected boolean rollDice() {
		return nbRandom.nextBoolean();
	}
	
	// MAIN
	public static void main(String[] args) {
		var john = new Fighter("John", 3);
	    var jane = new Fighter("Jane", 8);
	    System.out.println(john);
	    System.out.println(Arena.fight(john, jane) + " wins");
	}
}

// 1
// un générateur pseudo aléatoire renvoie un entier selon une certaine loi, 
// Avec un meme seed, on a toujours le meme résultat

// 3
// on controle mieux avec des getters et des setters

// 5
// A cause du copier coller, on devrait réécrire fire, alors que l'héritage permet de ne pas avoir ce probleme

// 6
// RollDice doit etre protected

// 9 
// sous typage : redefinir une méthode dans une classe héritée pour la rendre plus précise, plus spécifique
// polymorphisme : redefinir une methode dans une classe heritee pour qu'elle ait un comportement different.
