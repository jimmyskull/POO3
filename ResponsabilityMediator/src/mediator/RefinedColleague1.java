package mediator;

public class RefinedColleague1 extends Colleague {
	private String nickname;

	public RefinedColleague1(String nickname, Mediator mediator) {
		super(mediator);
		setNickname(nickname);
		getMediator().joinRoom(getNickname(), this);
	}

	@Override
	public String getNickname() {
		return nickname;
	}

	@Override
	public void newMessage(String from, String message) {
		System.out.println(from + " -> " + getNickname() + ": " + message);
	}

	@Override
	public void sendMessage(String to, String message) {
		getMediator().sendMessage(this, to, message);
	}

	private void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
