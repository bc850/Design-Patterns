import java.util.ArrayList;

public abstract class MathDecorator implements Function {
	protected Function decorate;
	protected ArrayList<Function> al = new ArrayList<>();
	
	public abstract double value(double x);
}
