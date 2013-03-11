package observer;

public class ConcreteObserverB implements Observer {

	@Override
	public void notifyChange() {
		System.out.println("ConcreteObserverB notified");
	}

}
