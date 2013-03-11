package observer;

public class ConcreteObserverA implements Observer {

	@Override
	public void notifyChange() {
		System.out.println("ConcreteObserverA notified");
	}

}
