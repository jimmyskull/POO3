package relogio;

public class DisplayDigital implements RelogioObserver {

	@Override
	public void update() {
		System.out.println("Relógio Digital: " + Relogio.getInstance().getTime());
	}

}
