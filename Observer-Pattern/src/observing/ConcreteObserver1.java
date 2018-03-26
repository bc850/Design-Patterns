package observing;

public class ConcreteObserver1<T> implements CustomObserver<T>, Priority1{

	private T t;
	
	public ConcreteObserver1(T t){
		this.t = t;
	}
	
	/*public T getValue() {
		return t;
	}*/
	
	@Override
	public void update(T t) {
			this.t = t;
			System.out.println(t);
		}
	
}
