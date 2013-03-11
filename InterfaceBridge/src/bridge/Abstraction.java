package bridge;

public abstract class Abstraction {
	private Implementor impl;
	
	protected Abstraction(Implementor implementor) {
		impl = implementor;
	}

	protected Implementor getImplementor() {
		return impl;
	}
	
	public abstract void function();
}
