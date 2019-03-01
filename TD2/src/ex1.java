
public class ex1 {

	public static void main(String[] args) {
		 var s8 = "hello";
	     var s9 = s8.toUpperCase();
	     System.out.println(s9);
	}

}


// Réponses

// 1.
// s est une string
// Il le convertit en string avec la fonction length de String

// 2.
// s1 == s2 : true
// s1 == s3 : false
// l’opérateur == compare les références des deux objets pour vérifier s’ils correspondent à la même instance

//3.
// var s4 = "toto";
// var s5 = new String(s4);
// if ( s4.compareTo(s5)==0) {System.out.println("s4 = s5");}
// --> renvoie "s4 = s5"

//4.
// Le test renvoie "true"
// == focntionne en comparant caractère par caractère

//5.
// String est immutable en Java pour plusieurs raisons : la Sécurité (pas que les chaines changent), et surtout le String Pool

//6.
// renvoie : hello
// pour que ça marche
// var s9 = s8.toUpperCase();



