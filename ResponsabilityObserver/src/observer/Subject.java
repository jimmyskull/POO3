package observer;

import java.util.LinkedList;

public class Subject {
	private LinkedList<Observer> observers;
	
	public Subject() {
		observers = new LinkedList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for (Observer o: observers) 
			o.notifyChange();
	}
	

}
