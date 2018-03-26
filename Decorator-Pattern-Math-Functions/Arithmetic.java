import java.util.ArrayList;

public final class Arithmetic<E> extends MathDecorator {
	
	private char operator = ' ';
	private double mf;
	
	Arithmetic(char operator, Function c, Function x) {
		this.operator = operator;
		this.al.add(c);
		this.al.add(x);
	}
	
	@Override
	public double value(double x) {
		if(operator == '+') {
			mf = al.get(0).value(x) + al.get(1).value(x);
		} else if(operator == '-') {
			mf = al.get(0).value(x) - al.get(1).value(x);
		} else if(operator == '*') {
			mf = al.get(0).value(x) * al.get(1).value(x);
		} else if(operator == '/') {
			mf = al.get(0).value(x) / al.get(1).value(x);
		}
		return mf;
	}
}
