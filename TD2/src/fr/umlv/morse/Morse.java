package fr.umlv.morse;
import java.lang.StringBuilder;

public class Morse {
	


	public static void main(String[] args) {
//		questionUn(args);
//		questionTrois(args);
		questionQuatre(args);
	}
	
	//1
	public static void questionUn(String[] args) {
		for (String item: args){
			System.out.print(item + " Stop. ");
		}
	}
	
	//2
	//permet de ne pas créer un nouveau string
	
	//3
	public static void questionTrois(String[] args) {
		for (String item: args){
			StringBuilder sb = new StringBuilder();
			sb.append(item + " Stop. ");
			System.out.print(sb.toString());
		}
	}
	
	//4
	 public static void questionQuatre(String[] args) {
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
       }
	 //Pour un seul caractère on peut mettre des ''
	 
	 //5
	 // Le bytecode est beaucoup plus long avec le code de la question 1
	 // On doit utiliser append() quand on concatène plus de deux haines de caractère 
}

