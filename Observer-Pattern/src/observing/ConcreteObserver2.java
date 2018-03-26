package observing;

public class ConcreteObserver2<T> implements CustomObserver<T>, Priority2{

	private T t;
	
	public ConcreteObserver2(T t){
		this.t = t;
	}
	
	@Override
	public void update(T t) {
			this.t = t;
			System.out.println(t);
		}
	
}
