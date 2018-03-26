import static java.lang.Math.exp;
import static java.lang.Math.pow;

public final class PowerOf extends MathDecorator{
	PowerOf(Function x, Function c) {
		this.al.add(x);
		this.al.add(c);
	}
	
	@Override
	public double value(double x) {
		return pow(al.get(0).value(x), al.get(1).value(x));
	}
}
