package mediator;

public abstract class Colleague {
	private Mediator mediator;
	
	protected Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	protected Mediator getMediator() {
		return mediator;
	}
	
	public abstract String getNickname();
	public abstract void newMessage(String from, String message);
	public abstract void sendMessage(String to, String message);
	
	public String toString() {
		return getNickname();
	}
}
