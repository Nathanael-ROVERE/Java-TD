
class A {
	  int x = 1;

	  public int getX() {
	    return x;
	  }
	  
	  static void printX(A a) {
	    System.out.println("in A.printX");
	    System.out.println("x " + a.x);
	    System.out.println("getX() " + a.getX());
	  }
	  
	  int m(A a) { return 1; }
}

class B extends A {
	  int x = 2;

	  public int getX() {
	    return x;
	  }
	  
	  static void printX(B b) {
	    System.out.println("in B.printX");
	    System.out.println("x " + b.x);
	    System.out.println("getX() " + b.getX());
	  }
	  
	  int m(B b) { return 2; }
}

public class Overridings {
		
	  public static void main(String[] args) {
	    A.printX(new A());
	    B.printX(new B());
	    A.printX(new B());
	    A a = new B();
	    a.m(a); 
	  }
}

// 1
// Expected :
// in A.printX
// x 1
// getX() 1

// OK


// 2
// Expected :
// in B.printX
// x 2
// getX() 2

// OK


// 3
// Expected :
// in A.printX
// x 2
// getX() 2

// En fait le x est toujours celui de la classe à laquelle appartient la méthode, donc "x 1"


// 4
// Expected
// pas de return donc ne renvoit rien

// OK

	
