public final class Max extends MathDecorator {

	Max(Function c, Function x) {
		this.al.add(c);
		this.al.add(x);
	}
	
	Max(Function[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.al.add(arr[i]);
		}
	}
	
	@Override
	public double value(double x) {
		int largest = 0;
		for(int i = 0; i < al.size() - 1; i++) {
			if(al.get(largest).value(x) < al.get(i + 1).value(x)) {
				largest = i + 1;
			}
		}
		return al.get(largest).value(x);
	}
}
