package observing;

public class ConcreteObserver3<T> implements CustomObserver<T>, Priority3{

	private T t;
	
	public ConcreteObserver3(T t){
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
