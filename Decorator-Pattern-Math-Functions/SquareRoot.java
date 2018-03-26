import static java.lang.Math.sqrt;

public final class SquareRoot extends MathDecorator {
	SquareRoot(Function x) {
		this.al.add(x);
	}
	
	@Override
	public double value(double x) {
		return sqrt(al.get(0).value(x));
	}
}
