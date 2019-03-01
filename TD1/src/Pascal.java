
public class Pascal {
	static int pascal(int nBut, int pBut) {
		int[] tab = new int[nBut+1];
		int n, i;
		tab[0] = 1;
		
		for (n=1; n<=nBut; n++){
			tab[n] = 1;
			
			for(i = n-1; i>0; i--) {
				tab[i] = tab[i-1] + tab[i];
			}
		}
		return tab[pBut];
	}

	public static void main(String[] args) {
	  System.out.println(String.format("Cn, p = %d", pascal(30000,250)));
	}
}


///(Le résultat obtenu est le résultat contraire à celui voulu)
///La différence de vitesse entre les deux programmes peut être expliquée par
//le fait que le langage C ne vérifie pas les valeurs des cases quand il essaie
//d’y accéder alors que le langage JAVA oui.