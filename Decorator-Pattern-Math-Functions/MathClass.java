
public final class MathClass {

	public static void main(String[] args) {
		final xValue x = new xValue();
		final Constant c = new Constant(4);
		final Constant c2 = new Constant(10);
		final char add = '+';
		final char subtract = '-';
		final char multiply = '*';
		final char divide = '/';
		final Function[] arrfunct = { new Constant(1), new Constant(5), new Constant(2), new Constant(9),
				new Constant(99), new Constant(1003), new Constant(45), new Constant(87.5), new xValue() , new xValue() };

		final Arithmetic addition = new Arithmetic(add, c, x);
		System.out.println("Addition: of " + c.value(10000) + " " + add + " " + x.value(3) + " = " + addition.value(3));
		System.out.println("-----");

		final Arithmetic subtraction = new Arithmetic('-', c, x);
		System.out.println(
				"Subtraction of " + c.value(10000) + " " + subtract + " " + x.value(3) + " = " + subtraction.value(3));
		System.out.println("-----");

		final Square squared = new Square(x);
		System.out.println("Square of " + x.value(3) + " = " + squared.value(3));
		System.out.println("-----");

		final Square squared2 = new Square(c);
		System.out.println("Square of " + c.value(20000) + " = " + squared2.value(20000));
		System.out.println("-----");

		final Exponential exp1 = new Exponential(x);
		System.out.println("e to the power of " + x.value(5) + " = " + exp1.value(5));
		System.out.println("-----");

		final Exponential exp2 = new Exponential(c);
		System.out.println("e to the power of " + c.value(23453647) + " = " + exp2.value(345746587));
		System.out.println("-----");

		final SquareRoot sqrt1 = new SquareRoot(x);
		System.out.println("Square Root of " + x.value(144) + " = " + sqrt1.value(144));
		System.out.println("-----");

		final SquareRoot sqrt2 = new SquareRoot(c);
		System.out.println("Square Root of " + c.value(135476) + " = " + sqrt2.value(87));
		System.out.println("-----");

		final PowerOf pow1 = new PowerOf(c, x);
		System.out.println("Power of " + c.value(10000) + "^" + x.value(3) + " = " + pow1.value(3));
		System.out.println("-----");
		
		final PowerOf pow2 = new PowerOf(c, x);
		System.out.println("Power of " + c.value(10000) + "^" + x.value(9) + " = " + pow2.value(9));
		System.out.println("-----");

		final Sine sine1 = new Sine(x);
		System.out.println("Sin of " + x.value(12) + " = " + sine1.value(12));
		System.out.println("-----");

		final Sine sine2 = new Sine(c);
		System.out.println("Sin of " + c.value(12435476) + " = " + sine2.value(243546));
		System.out.println("-----");

		final Round round1 = new Round(x, c);
		System.out.println(x.value(10.123456789) + " rounded to " + c.value(243564) + " decimal places = "
				+ round1.value(10.123456789));
		System.out.println("-----");
		
		final Round round2 = new Round(x, c);
		System.out.println(x.value(10.123456789101112) + " rounded to " + c.value(243564) + " decimal places = "
				+ round2.value(10.123456789101112));
		System.out.println("-----");

		final Max max1 = new Max(c, x);
		System.out.println("The max between " + c.value(243564) + " and " + x.value(1) + " = " + max1.value(1));
		System.out.println("-----");
	
		final Max max2 = new Max(arrfunct);
		System.out.println("The max of the array is " + max2.value(1));
		System.out.println("-----");
		
		final Combination comb1 = new Combination(c, x);
		System.out.println("The combination of " + c.value(243564) + " and " + x.value(2) + " = " + comb1.value(2));
		System.out.println("-----");

		/*
		 * //Will Throw an error, because x is larger than c! final Combination comb2 =
		 * new Combination(c, x); System.out.println("The combination of " +
		 * c.value(243564) + " and " + x.value(5) + " = " + comb2.value(5));
		 * System.out.println("-----");
		 */
	}

}
