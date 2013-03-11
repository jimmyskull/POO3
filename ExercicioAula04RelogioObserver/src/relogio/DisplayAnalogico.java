package relogio;

public class DisplayAnalogico implements RelogioObserver {

	@Override
	public void update() {
		System.out.println("Relógio Analógico: " + Relogio.getInstance().getTime());
	}

}
