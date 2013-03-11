package relogio;

import java.util.Date;
import java.util.LinkedList;

public class Relogio extends Thread {
	private static Relogio instance = new Relogio();
	
	private LinkedList<RelogioObserver> observers;
	
	Relogio() {
		observers = new LinkedList<RelogioObserver>();
		start();
	}

	public void registerObserver(RelogioObserver observer) {
		observers.add(observer);
	}
	
	private  void notifyObservers() {
		for (RelogioObserver o: observers) 
			o.update();
	}
	
	public Integer getTime() {
		Date now = new Date();  	
		Long longTime = new Long(now.getTime() / 1000);
		return longTime.intValue();
	}

	public static Relogio getInstance() {
		return instance;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			notifyObservers();
		}
	}
}
