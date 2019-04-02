package fr.umlv.calc.main;

import java.util.Scanner;
import fr.umlv.calc.OpOrValue;

public class Main {

	public static void main(String[] args) {
		OpOrValue expression = new OpOrValue(OpOrValue.OP_ADD,
				new OpOrValue(2),
				new OpOrValue(3)
				);
		System.out.println(expression.eval());
		Scanner s = new Scanner("- + 2 3 4");
		OpOrValue test = OpOrValue.parse(s);
		System.out.println(test.eval());
	}
}
