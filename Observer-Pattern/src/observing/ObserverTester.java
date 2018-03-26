package observing;

public class ObserverTester {

	public static void main(String[] args) {
		ConcreteObservable observ = new ConcreteObservable<String>(null);
		
		ConcreteObserver1 test1 = new ConcreteObserver1<String>(null);
		ConcreteObserver1 yeahbuddy = new ConcreteObserver1<String>(null);
		
		ConcreteObserver2 test2 = new ConcreteObserver2<String>(null);
		
		ConcreteObserver3 next = new ConcreteObserver3<String>(null);
		
		observ.addObserver(test1);
		observ.addObserver(yeahbuddy);
		observ.addObserver(test2);
		observ.addObserver(next);
		
		observ.setPriority("1");
		observ.setObs("Gnarly!");
		System.out.println("---");
		
		observ.setPriority("2");
		observ.setObs("Radical!");
		System.out.println("---");
		
		observ.setPriority("3");
		observ.setObs("Bodacious!");
		System.out.println("---");
		
		observ.setPriority("1, 3");
		observ.setObs("Righteous!");
		System.out.println("---");
		
		observ.setPriority("2, 3");
		observ.setObs("Groovy!");
		System.out.println("---");
		
		observ.setPriority("No priority");
		observ.setObs("Tubular!");
	}

}
