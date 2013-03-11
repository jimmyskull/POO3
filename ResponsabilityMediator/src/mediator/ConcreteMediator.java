package mediator;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {
	private HashMap<String, Colleague> room;
	
	public ConcreteMediator() {
		room = new HashMap<String, Colleague>();
	}
	
	@Override
	public void joinRoom(String nickname, Colleague colleague) {
		if (!room.containsKey(nickname)) {
			room.put(nickname, colleague);
		}
	}

	@Override
	public void sendMessage(Colleague sender, String destination, String message) {
		if (!room.containsKey(sender.getNickname())) 
			return;
		if (!room.containsKey(destination))
			return;
		room.get(destination).newMessage(sender.getNickname(), message);
	}

}
