import static java.lang.Math.exp;

public final class Exponential extends MathDecorator {
	Exponential(Function x) {
		this.al.add(x);
	}
	
	@Override
	public double value(double x) {
		return exp(al.get(0).value(x));
	}
}
