package tester;

import relogio.Display;
import relogio.DisplayAnalogico;
import relogio.DisplayDigital;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display dd = new DisplayDigital();
		Display da = new DisplayAnalogico();
		
		dd.updateRelogio();
		da.updateRelogio();
	}

}
