package tester;

import mediator.Colleague;
import mediator.ConcreteMediator;
import mediator.Mediator;
import mediator.RefinedColleague1;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator med = new ConcreteMediator();
		
		Colleague col1 = new RefinedColleague1("paulo", med);
		Colleague col2 = new RefinedColleague1("joão", med);
		
		col1.sendMessage("joão", "oi");
		col2.sendMessage("paulo", "oi, tudo bem?");
	}

}
