
public final class Constant implements Function {
	double c = 0.0;
	
	public Constant(double c) {
		this.c = c;
	}
	
	public double value(double x) {
		return c;
	}
}
