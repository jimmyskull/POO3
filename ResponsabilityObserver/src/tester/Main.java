package tester;

import observer.ConcreteObserverA;
import observer.ConcreteObserverB;
import observer.Subject;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject s = new Subject();
		s.registerObserver(new ConcreteObserverA());
		s.registerObserver(new ConcreteObserverB());
		
		s.notifyObservers();
	}

}
