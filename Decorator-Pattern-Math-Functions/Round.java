import java.text.DecimalFormat;

public final class Round extends MathDecorator {
	Round(Function x, Function c) {
		this.al.add(x);
		this.al.add(c);
	}
	
	@Override
	public double value(double x) {
		String rounder = "#0.";
		for(double i = 0; i < al.get(1).value(x); i++) {
			rounder += "0";
		}
		DecimalFormat df = new DecimalFormat(rounder);
		return Double.parseDouble(df.format(al.get(0).value(x)));
	}
}
