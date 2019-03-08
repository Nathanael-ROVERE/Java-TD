
public class Main {
	
	private int foo;
	
	public static void main(String[] args) {
		System.out.println("Hello Eclipse");		
	}
	
	// 3 
	public int getFoo() {
		return foo;
	}
	
	public void setFoo(int foo) {
		this.foo = foo;
	}
	
	// 4
	// Source --> Generate Constructor Using Fields...
	public Main(int foo) {
		super();
		this.foo = foo;
	}
}

// EXERCICE 1
 
//1
// sysout + ctrl + space
// System.out.println();

// 2
// toStr + ctrl + space
/*
 @Override
 public String toString() {
	// TODO Auto-generated method stub
 return super.toString();
 }
*/

// 5 
// Alt + Shift + R
// Change toutes les occurences du nom en le nouveau nom qu'on lui donne

// 6 
//int coucou = 2 + 3;
//a = coucou + 4;

// 7
// Integer integer = new Integer(2);

// 8 
// Ouvre la doc de référence
