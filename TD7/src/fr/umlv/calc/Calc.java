
package fr.umlv.calc;


public abstract class Calc implements Expr {
	
	// MEMBERS
	private final Expr left;
	private final Expr right;
	
	// CONSTRUCTOR
	public Calc(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}
	
	// GETTERS
	public Expr getLeft() {
		return left;
	}

	public Expr getRight() {
		return right;
	}

	// METHODS
	
	//symbol of the operation
	public abstract String getSymbol();

	@Override
	public String toString() {
		return left.toString() + ' ' + this.getSymbol() + ' ' + right.toString();		
	}
}
