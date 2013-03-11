package tester;

import relogio.DisplayAnalogico;
import relogio.DisplayDigital;
import relogio.Relogio;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Relogio r = Relogio.getInstance();
		
		r.registerObserver(new DisplayDigital());
		r.registerObserver(new DisplayAnalogico());
		
		r.join();
	}

}
