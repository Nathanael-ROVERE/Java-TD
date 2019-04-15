package fr.umlv.data;

public class Main {

	public static void main(String[] args) {
		
		// EXERCICE 1
		System.out.println("EXERCICE 1");
		System.out.println("----------------");

		// 1.1 
		// On met la classe en package et ses attributs privés

		// 1.2
		// On compile avec javac
		
		// 1.3
		
		Link a = new Link(2);
		Link b = new Link(456);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\n");
		
		// EXERCICE 2
		System.out.println("EXERCICE 2");
		System.out.println("----------------");
		
		// 2.2
		// Pour un index hors de la liste, on renvoie une exception pour avertir du problème
		
		// 2.3		
		LinkedLink c = new LinkedLink();
		
		c.add("Game");
		c.add("Of");
		c.add("Thrones");
		
		System.out.println(((String)c.get(2)).length());
		
		// 2.4
		// On n'aime pas les casts parce que c'est une source d'erreurs 
		// dans un langage typé comme le java
		
		System.out.println("\n");
		
		// EXERCICE 3
		System.out.println("EXERCICE 3");
		System.out.println("----------------");
		
		// 3.1
		// Rajouter un type paramétré permet de créer des objets génériques 
		// pour faire des opérations sans se pencher sur son type précis
		
		// 3.3
		LinkedLink<String> strings = new LinkedLink();
		
		strings.add("Bulbizarre");
		strings.add("Carapuce");
		strings.add("Salameche");
		
		System.out.println(((String)strings.get(2)).length());
		
		// 3.4
		
	}

}
