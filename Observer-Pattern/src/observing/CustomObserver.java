package observing;

public abstract interface CustomObserver<T> {
	public default void update(T t){		
	}
}
