import java.lang.Integer;
import java.util.Arrays;

public class Sum {
	
	static int[] stringToInt(String[] tab) {
		int[] intTab = new int[tab.length];
		for (int i=0; i < tab.length; i++) {
			intTab[i] = Integer.parseInt(tab[i]);
		}
		return intTab;
	}
	
	static int sumTab(int[] tab) {
		int sum = 0;
		for (int val: tab) {
			sum += val;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] tab = new String[] {"1", "2", "3"};
		int[] result = stringToInt(tab);
		
		System.out.println(Arrays.toString(result));
		System.out.println(String.format("Somme du tableau: %d", sumTab(result)));
	}

}


//// Questions

//2 
//Une méthode statique est une méthode accessible uniquement depuis sa classe (pas d'instanciation)

//3
//Erreur