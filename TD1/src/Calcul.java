import java.util.Scanner; 

public class Calcul { 
	public static void main(String[] args) {
		System.out.println("Entrer une valeur : ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		System.out.println("Entrer une autre valeur : ");
		Scanner scanner2 = new Scanner(System.in);
		int value2 = scanner2.nextInt();
		
		System.out.println(String.format("Somme : %d",  value + value2));
		System.out.println(String.format("Difference : %d",  value - value2));
		System.out.println(String.format("Multiplication : %d",  value * value2));
		System.out.println(String.format("Quotient : %d",  value / value2));
		System.out.println(String.format("Reste : %d",  value % value2));
	}
}

//// QUESTIONS

//2

//Variable scanner de type Scanner
//Variable value de type int

//3

//Ce n'est pas une fonction puisque cest une méthode appartenant à la classe Scanner

//4

//Cette ligne importe la classe Scanner

