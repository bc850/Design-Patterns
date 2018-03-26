
public final class Square extends MathDecorator {
	
	Square(Function x) {
		this.al.add(x);
	}
	
	@Override
	public double value(double x) {
		return al.get(0).value(x) * al.get(0).value(x);
	}
}
