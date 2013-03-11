package relogio;

public class DisplayAnalogico extends Display {

	@Override
	public void updateRelogio() {
		System.out.println("Relógio Analógico: " + getRelogio().getTime());
	}

}
