public final class Combination extends MathDecorator {

	Combination(Function c, Function x) {
		this.al.add(c);
		this.al.add(x);
	}

	@Override
	public final double value(double x) {
		if (al.get(0).value(x) < al.get(1).value(x)) {
			System.out.println(al.get(1).value(x) + " is an invalid value for combination of (" + al.get(0).value(x)
					+ ", " + al.get(1).value(x) + ")!\n*******THROWING ERROR*******");
			throw new IllegalArgumentException();
		}
		return perm(al.get(0).value(x)) / (perm(al.get(1).value(x)) * perm(al.get(0).value(x) - al.get(1).value(x)));
	}

	public final double perm(double x) {
		if (x == 1) {
			return 1;
		}
		return x * perm(x - 1);
	}
}