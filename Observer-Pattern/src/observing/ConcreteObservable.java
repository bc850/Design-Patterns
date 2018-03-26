package observing;

public class ConcreteObservable<T> extends CustomObservable<T>{
	
	private T t;
	String priorityString;
	
	public ConcreteObservable(T t){
		this.t = t;
	}
	
	public void setObs(T t){
		this.t = t;
		setChanged();
		notifyObservers(t);
	}
	
	public T getObs(){
		return t;
	}
	
	@Override
	public void notifyObservers(T t) {
		if(changed == true) {
			if(getPriority().contains("1")) {
				for(int i = 0; i < priority1List.size(); i++) {
					(priority1List.get(i)).update(t);
				}
			} 
			
			if (getPriority().contains("2")) {
				for(int i = 0; i < priority2List.size(); i++) {
					(priority2List.get(i)).update(t);
				}
			} 
			
			if (getPriority().contains("3")) {
				for(int i = 0; i < priority3List.size(); i++) {
					(priority3List.get(i)).update(t);
				}
			}
			
			if(!getPriority().contains("1") && !getPriority().contains("2") && !getPriority().contains("3")) {
				for(int i = 0; i < observers.size(); i++) {
					(observers.get(i)).update(t);
				}
			}
		clearChanged();
		}
	}
}
