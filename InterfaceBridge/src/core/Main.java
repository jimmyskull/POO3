package core;

import bridge.ConcreteImplementor1;
import bridge.ConcreteImplementor2;
import bridge.RefinedAbstraction;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new RefinedAbstraction(new ConcreteImplementor1()).function();
		new RefinedAbstraction(new ConcreteImplementor2()).function();
	}

}
