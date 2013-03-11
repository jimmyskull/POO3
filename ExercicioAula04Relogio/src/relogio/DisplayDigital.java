package relogio;

public class DisplayDigital extends Display {

	@Override
	public void updateRelogio() {
		System.out.println("Relógio Digital: " + getRelogio().getTime());
	}

}
