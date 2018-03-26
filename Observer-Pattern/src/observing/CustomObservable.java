package observing;

import java.util.ArrayList;

public abstract class CustomObservable <T> {
	
	ArrayList<CustomObserver> observers = (ArrayList<CustomObserver>) new ArrayList<T>();
	ArrayList<CustomObserver> priority1List = (ArrayList<CustomObserver>) new ArrayList<T>();
	ArrayList<CustomObserver> priority2List = (ArrayList<CustomObserver>) new ArrayList<T>();
	ArrayList<CustomObserver> priority3List = (ArrayList<CustomObserver>) new ArrayList<T>();
	
	String priorityString;
	boolean changed = false;
	
	public void addObserver(CustomObserver observer) {
		observers.add(observer);
		if(observer instanceof Priority1) {
			priority1List.add(observer);
			//setPriority("1");
		} else if (observer instanceof Priority2) {
			priority2List.add(observer);
			//setPriority("2");
		} else if (observer instanceof Priority3) {
			priority3List.add(observer);
			//setPriority("3");
		}
	}
	
	public void removeObserver(CustomObserver observer) {
		observers.remove(observer);
	}
	
	protected void notifyObservers(T t){
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(t);
		}
		clearChanged();
	}
	
	protected void setChanged() {
		changed = true;
	}
	
	protected void clearChanged() {
		changed = false;
	}
	
	public boolean hasChanged() {
		return changed;
	}
	
	public int countObservers() {
		return observers.size();
	}
	
	public void setPriority(String priorityString) {
		this.priorityString = priorityString;
	}

	public String getPriority() {
		return priorityString;
	}
}
