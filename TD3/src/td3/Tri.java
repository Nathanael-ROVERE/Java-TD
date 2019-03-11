package td3;

public class Tri {

	public static void main(String[] args) {
		int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		afficheTableau(tab); // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
		
		// 1
		swap(tab, 0, 6);
		afficheTableau(tab); // {6, 1, 2, 3, 4, 5, 0, 7, 8, 9}
		
		// 2, 3
		System.out.println(indexOfMin(tab, 3, 8)); //6
				
		// 4
		int[] tab2 = {7, 3, 9, 2, 6, 1};
		sort(tab2);
		afficheTableau(tab2);

	}
	
	public static void afficheTableau(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	
	public static int indexOfMin(int[] tableau, int indexMin, int indexMax) {
		int indexOfMin = indexMin;
		int min = tableau[indexMin];
		for (int i = indexMin; i < indexMax; i++) {
			if (min > tableau[i]) {
				min = tableau[i];
				indexOfMin = i;
			}
		}		
		return indexOfMin;
	}
	
	public static void sort(int[] tableau) {
		int taille = tableau.length;
		for (int i=0; i < taille; i++) {
			int indexMin = indexOfMin(tableau, i, taille);
			if (indexMin != i) {
				swap(tableau, i, indexMin);
			}
		}
	}
}
