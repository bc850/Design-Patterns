import static java.lang.Math.exp;
import static java.lang.Math.sin;

public final class Sine extends MathDecorator {
	Sine(Function x) {
		this.al.add(x);
	}
	
	@Override
	public double value(double x) {
		return sin(al.get(0).value(x));
	}
}
