package bridge;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	
	@Override
	public void function() {
		getImplementor().implementation();
	}

}
