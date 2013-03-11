package mediator;

public interface Mediator {
	public void joinRoom(String nickname, Colleague colleague);
	public void sendMessage(Colleague sender, String destination, String message);
}
