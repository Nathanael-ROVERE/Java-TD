package fr.umlv.calc;

import java.util.Scanner;

public interface Expr {
	
	public int eval();
	
	public static Expr parse(Scanner scanner) {
		if (!scanner.hasNext()) throw new RuntimeException("c'est pas bien");

		String s = scanner.next();
		switch (s) {
		case("+"): return new Add(scanner(s), parse(scanner), parse(scanner));
		case("-"): return new Sub(OP_SUB, parse(scanner), parse(scanner));
		default: return new Value(Integer.parseInt(s));
		}
	}

}
